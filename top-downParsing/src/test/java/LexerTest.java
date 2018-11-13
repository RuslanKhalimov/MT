import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.ParseException;

public class LexerTest {
    @Test
    void testCorrectInput() {
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
            Assertions.fail("shouldn't fail");
        }
    }
}
