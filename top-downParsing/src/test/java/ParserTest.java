import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.util.Random;

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
        test("|a", true);
    }

    @Test
    void testIllegalCharacter() {
        test("a+b", true);
        test("a|b'", true);
        test("a-b", true);
        test("[a&b]", true);
    }

    @Test
    void testEmptyInput() {
        test("", true);
    }

    @Test
    void randomTests() {
        for (int i = 0; i < 1000; i++) {
            System.err.println("random test " + (i + 1));
            test(generateRandomExpression(10), false);
        }
    }

    private Random random = new Random();
    private String[] operations = {"^", "|", "&", "!"};

    private String generateRandomExpression(int depth) {
        if (depth == 0) {
            return String.valueOf((char)('a' + Math.abs(random.nextInt()) % 26));
        }
        String op = operations[Math.abs(random.nextInt()) % 4];
        if (op.equals("!")) {
            return "!(" + generateRandomExpression(depth - 1) + ")";
        }
        String left = generateRandomExpression(depth - 1);
        String right = generateRandomExpression(depth - 1);
        return "(" + left + op + right + ")";
    }
}
