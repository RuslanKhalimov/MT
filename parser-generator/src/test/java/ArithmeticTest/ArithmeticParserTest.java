package ArithmeticTest;

import org.junit.Assert;
import org.junit.Test;
import results.Arithmetic.ArithmeticParser.AddSub;
import results.Arithmetic.ArithmeticParser;

import java.text.ParseException;

public class ArithmeticParserTest {
    private void test(String input, boolean shouldFail) {
        ArithmeticParser parser = new ArithmeticParser();
        try {
            AddSub result = parser.parse(input);
            System.out.println(input + " = " + result.v);
        } catch (ParseException e) {
            System.out.println(e.getMessage());
            Assert.assertTrue(shouldFail);
            return;
        }
        Assert.assertFalse(shouldFail);
    }

    @Test
    public void testum() {
        test("1", false);
        test("12903", false);
        test("((13))", false);
    }

    @Test
    public void testAddSub() {
        test("2 + 2", false);
        test("1 - 2", false);
        test("1 - 2 - 3", false);
        test("1 + (2 - 3) - 2", false);
    }

    @Test
    public void testMulDiv() {
        test("2*3", false);
        test("21 / 7", false);
        test("2 + 2*2", false);
        test("(2 + 2)*2", false);
    }

    @Test
    public void testIncorrect() {
        test("2++2", true);
        test("-2", true);
        test("2^3", true);
        test("(2 - 3", true);
        test("()", true);
        test("2+", true);
    }

    @Test
    public void randomTests() {
        RandomTestGenerator randomTestGenerator = new RandomTestGenerator();
        for (int i = 0; i < 100; i++) {
            test(randomTestGenerator.getRandomTest(), false);
        }
    }
}
