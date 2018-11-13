import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.text.ParseException;

public class ParserTest {
    private String deleteSpaces(String s) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isSpaceChar(s.charAt(i))) {
                res.append(s.charAt(i));
            }
        }
        return res.toString();
    }

    private void test(String expression, boolean shouldFail) {
        SyntaxAnalizer syntaxAnalizer = new SyntaxAnalizer();
        String result;
        try {
            result = syntaxAnalizer.parse(expression).toString();
        } catch (ParseException e) {
            Assertions.assertTrue(shouldFail);
            return;
        }
        Assertions.assertFalse(shouldFail);
        Assertions.assertEquals(deleteSpaces(expression), result);
    }

    @Test
    void sampleTestWithVisualization() {
        SyntaxAnalizer syntaxAnalizer = new SyntaxAnalizer();
        Node tree;
        try {
            tree = syntaxAnalizer.parse("!(!a|b&(c|d))^e|!f^a");
            GraphvizUtils.visualizeTree(tree, "example");
        } catch (ParseException | InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    void testVariable() {
        test("a", false);
        test("d", false);
        test("(((x)))", false);
    }

    @Test
    void testNegation() {
        test("!a", false);
        test("!!!!a", false);
        test("!((!!(!a)))", false);
    }

    @Test
    void testConjunction() {
        test("a&a", false);
        test("a&b&c&d", false);
        test("(a&b)&(c&(d&e))", false);
    }

    @Test
    void testXor() {
        test("a^a", false);
        test("a^b^c^d", false);
        test("a^b&c^d&e", false);
        test("a^b&(c^d)&e", false);
    }

    @Test
    void testDisjunction() {
        test("a|a", false);
        test("a|b|c|d", false);
        test("a|b&c|d&e", false);
        test("a|b&(c|d)^e|f^a", false);
    }

    @Test
    void testWithSpaces() {
        test("a | b", false);
        test("    a", false);
        test("b   ", false);
        test("   a   ^  ! b   ", false);
    }

    @Test
    void testIncorrectInput() {
        test("a || b & c", true);
        test("!!x & a | (b & c", true);
        test("b)))", true);
        test("!!x & a | b)))", true);
        test("!!x & () | b", true);
        test("x !& a", true);
        test("x ! a", true);
        test("x () c", true);
        test("x &", true);
        test("x |", true);
        test("x ^", true);
        test("& x", true);
        test("|a", true);
        test("d | (d) | (e & a ^ a | (c) ^ (!a) | c) | b) | (!e) ^ (!a ^ (c))", true);
    }

    @Test
    void testIllegalCharacter() {
        test("a+b", true);
        test("a|b'", true);
        test("[a&b]", true);
    }

    @Test
    void testEmptyInput() {
        test("", true);
    }

    @Test
    void randomTests() {
        for (int i = 0; i < 10000; i++) {
            TestGenerator generator = new TestGenerator(127 * i);
            String expr = generator.getExpression();
//            System.out.println(expr);
            test(expr, false);
        }
    }
}
