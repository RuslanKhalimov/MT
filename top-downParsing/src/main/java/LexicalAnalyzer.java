import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.text.ParseException;

public class LexicalAnalyzer {
    private final InputStream inputStream;
    private int curPos;
    private int curChar;
    private Token curToken;

    public LexicalAnalyzer(InputStream inputStream) throws ParseException {
        this.inputStream = inputStream;
        curPos = 0;
        nextToken();
    }

    public LexicalAnalyzer(String inputString) throws ParseException {
        this(new ByteArrayInputStream(inputString.getBytes(Charset.forName("UTF-8"))));
    }

    private void nextChar() throws ParseException {
        curPos++;
        try {
            curChar = inputStream.read();
        } catch (IOException e) {
            throw new ParseException(e.getMessage(), curPos);
        }
    }

    public void nextToken() throws ParseException {
        nextChar();
        while (Character.isSpaceChar(curChar)) {
            nextChar();
        }
        if (curChar == '(') {
            curToken = Token.LPAREN;

        } else if (curChar == ')') {
            curToken = Token.RPAREN;

        } else if (curChar == '&') {
            curToken = Token.AND;

        } else if (curChar == '|') {
            curToken = Token.OR;

        } else if (curChar == '^') {
            curToken = Token.XOR;

        } else if (curChar == '!') {
            curToken = Token.NOT;

        } else if (Character.isLowerCase(curChar)) {
            curToken = Token.VAR;
        } else if (curChar == -1) {
            curToken = Token.END;
        } else {
            throw new ParseException("Illegal character : " + (char) curChar, curPos);
        }
    }

    public Token getCurToken() {
        return curToken;
    }

    public int getCurPos() {
        return curPos;
    }

    public char getCurChar() {
        return (char) curChar;
    }
}
