import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.text.ParseException;

public class SyntaxAnalizer {
    private LexicalAnalyzer lexicalAnalyzer;

    public Node parse(String expression) throws ParseException {
        return parse(new ByteArrayInputStream(expression.getBytes(Charset.forName("UTF-8"))));
    }

    public Node parse(InputStream inputStream) throws ParseException {
        lexicalAnalyzer = new LexicalAnalyzer(inputStream);
        Node res = E();
        if (lexicalAnalyzer.getCurToken() != Token.END) {
            throw new ParseException("unexpected suffix since index : ", lexicalAnalyzer.getCurPos());
        }
        return res;
    }

    private Node E() throws ParseException {
        Node res = new Node("E");
        switch (lexicalAnalyzer.getCurToken()) {
            case NOT:
            case VAR:
            case LPAREN:
                res.children.add(X());
                res.children.add(EPrime());
                break;
            default:
                throw new ParseException("unexpected char : " + lexicalAnalyzer.getCurChar(), lexicalAnalyzer.getCurPos());
        }
        return res;
    }

    private Node X() throws ParseException {
        Node res = new Node("X");
        switch (lexicalAnalyzer.getCurToken()) {
            case NOT:
            case VAR:
            case LPAREN:
                res.children.add(C());
                res.children.add(XPrime());
                break;
            default:
                throw new ParseException("unexpected char : " + lexicalAnalyzer.getCurChar(), lexicalAnalyzer.getCurPos());
        }
        return res;
    }

    private Node C() throws ParseException {
        Node res = new Node("C");
        switch (lexicalAnalyzer.getCurToken()) {
            case NOT:
            case VAR:
            case LPAREN:
                res.children.add(T());
                res.children.add(CPrime());
                break;
            default:
                throw new ParseException("unexpected char : " + lexicalAnalyzer.getCurChar(), lexicalAnalyzer.getCurPos());
        }
        return res;
    }

    private Node T() throws ParseException {
        Node res = new Node("T");
        switch (lexicalAnalyzer.getCurToken()) {
            case NOT:
                res.children.add(new Node("!"));
                lexicalAnalyzer.nextToken();
                res.children.add(T());
                break;
            case LPAREN:
                res.children.add(new Node("("));
                lexicalAnalyzer.nextToken();
                res.children.add(E());
                if (lexicalAnalyzer.getCurToken() != Token.RPAREN) {
                    throw new ParseException("unexpected char : " + lexicalAnalyzer.getCurChar() + ", expected : )", lexicalAnalyzer.getCurPos());
                }
                res.children.add(new Node(")"));
                lexicalAnalyzer.nextToken();
                break;
            case VAR:
                res.children.add(new Node(Character.toString(lexicalAnalyzer.getCurChar())));
                lexicalAnalyzer.nextToken();
                break;
            default:
                throw new ParseException("unexpected char : " + lexicalAnalyzer.getCurChar(), lexicalAnalyzer.getCurPos());
        }
        return res;
    }

    private Node EPrime() throws ParseException {
        Node res = new Node("E'");
        switch (lexicalAnalyzer.getCurToken()) {
            case OR:
                res.children.add(new Node("|"));
                lexicalAnalyzer.nextToken();
                res.children.add(X());
                res.children.add(EPrime());
                break;
            case RPAREN:
            case END:
                break;
            default:
                throw new ParseException("unexpected char : " + lexicalAnalyzer.getCurChar(), lexicalAnalyzer.getCurPos());
        }
        return res;
    }

    private Node XPrime() throws ParseException {
        Node res = new Node("X'");
        switch (lexicalAnalyzer.getCurToken()) {
            case XOR:
                res.children.add(new Node("^"));
                lexicalAnalyzer.nextToken();
                res.children.add(C());
                res.children.add(XPrime());
                break;
            case RPAREN:
            case OR:
            case END:
                break;
            default:
                throw new ParseException("unexpected char : " + lexicalAnalyzer.getCurChar(), lexicalAnalyzer.getCurPos());
        }
        return res;
    }

    private Node CPrime() throws ParseException {
        Node res = new Node("C'");
        switch (lexicalAnalyzer.getCurToken()) {
            case AND:
                res.children.add(new Node("&"));
                lexicalAnalyzer.nextToken();
                res.children.add(T());
                res.children.add(CPrime());
                break;
            case RPAREN:
            case OR:
            case XOR:
            case END:
                break;
            default:
                throw new ParseException("unexpected char : " + lexicalAnalyzer.getCurChar(), lexicalAnalyzer.getCurPos());
        }
        return res;
    }
}
