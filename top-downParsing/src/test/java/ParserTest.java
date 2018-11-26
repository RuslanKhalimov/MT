import org.junit.Test;
import org.junit.Assert;

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
            Assert.assertTrue(shouldFail);
            return;
        }
        Assert.assertFalse(shouldFail);
        Assert.assertEquals(deleteSpaces(expression), result);
    }

    @Test
    public void sampleTestWithVisualization() {
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
    public void testVariable() {
        test("a", false);
        test("d", false);
        test("(((x)))", false);
    }

    @Test
    public void testNegation() {
        test("!a", false);
        test("!!!!a", false);
        test("!((!!(!a)))", false);
    }

    @Test
    public void testConjunction() {
        test("a&a", false);
        test("a&b&c&d", false);
        test("(a&b)&(c&(d&e))", false);
    }

    @Test
    public void testXor() {
        test("a^a", false);
        test("a^b^c^d", false);
        test("a^b&c^d&e", false);
        test("a^b&(c^d)&e", false);
    }

    @Test
    public void testDisjunction() {
        test("a|a", false);
        test("a|b|c|d", false);
        test("a|b&c|d&e", false);
        test("a|b&(c|d)^e|f^a", false);
    }

    @Test
    public void testWithSpaces() {
        test("a | b", false);
        test("    a", false);
        test("b   ", false);
        test("   a   ^  ! b   ", false);
    }

    @Test
    public void testIncorrectInput() {
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
    public void testIllegalCharacter() {
        test("a+b", true);
        test("a|b'", true);
        test("[a&b]", true);
    }

    @Test
    public void testEmptyInput() {
        test("", true);
    }

    @Test
    public void randomTests() {
        for (int i = 0; i < 10000; i++) {
            TestGenerator generator = new TestGenerator(127 * i);
            String expr = generator.getExpression();
//            System.out.println(expr);
            test(expr, false);
        }
    }
}
