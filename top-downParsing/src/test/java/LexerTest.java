import org.junit.Test;
import org.junit.Assert;

import java.text.ParseException;

public class LexerTest {
    @Test
    public void testCorrectInput() {
        StringBuilder testString = new StringBuilder("|^&!()");
        for (char c = 'a'; c <= 'z'; c++) {
            testString.append(c);
        }
        LexicalAnalyzer lexicalAnalyzer;
        try {
            lexicalAnalyzer = new LexicalAnalyzer(testString.toString());
            while (lexicalAnalyzer.getCurToken() != Token.END) {
                lexicalAnalyzer.nextToken();
            }
        } catch (ParseException e) {
            e.printStackTrace();
            Assert.fail("shouldn't fail");
        }
    }
}
