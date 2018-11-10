import java.io.ByteArrayInputStream;
import java.nio.charset.Charset;
import java.text.ParseException;

public class SyntaxAnalizer {
    private LexicalAnalyzer lexicalAnalyzer;

    public Node parse(String expression) throws ParseException {
        lexicalAnalyzer = new LexicalAnalyzer(new ByteArrayInputStream(expression.getBytes(Charset.forName("UTF-8"))));
        lexicalAnalyzer.nextToken();
        return E();
    }

    private Node E() throws ParseException {
        Node res = new Node("E");
        switch (lexicalAnalyzer.getCurToken()) {
            case NOT:
            case VAR:
            case LPAREN:
                res.children.add(X());
                res.children.add(O());
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
                res.children.add(B());
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
                res.children.add(N());
                res.children.add(A());
                break;
            default:
                throw new ParseException("unexpected char : " + lexicalAnalyzer.getCurChar(), lexicalAnalyzer.getCurPos());
        }
        return res;
    }

    private Node N() throws ParseException {
        Node res = new Node("N");
        switch (lexicalAnalyzer.getCurToken()) {
            case NOT:
                res.children.add(new Node("!"));
                lexicalAnalyzer.nextToken();
                res.children.add(N());
                break;
            case VAR:
            case LPAREN:
                res.children.add(T());
                break;
            default:
                throw new ParseException("unexpected char : " + lexicalAnalyzer.getCurChar(), lexicalAnalyzer.getCurPos());
        }
        return res;
    }

    private Node T() throws ParseException {
        Node res = new Node("T");
        switch (lexicalAnalyzer.getCurToken()) {
            case VAR:
                res.children.add(V());
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
            default:
                throw new ParseException("unexpected char : " + lexicalAnalyzer.getCurChar(), lexicalAnalyzer.getCurPos());
        }
        return res;
    }

    private Node V() throws ParseException {
        Node res = new Node("V");
        switch (lexicalAnalyzer.getCurToken()) {
            case VAR:
                res.children.add(new Node(String.valueOf(lexicalAnalyzer.getCurChar())));
                lexicalAnalyzer.nextToken();
                break;
            default:
                throw new ParseException("unexpected char : " + lexicalAnalyzer.getCurChar(), lexicalAnalyzer.getCurPos());
        }
        return res;
    }

    private Node O() throws ParseException {
        Node res = new Node("O");
        switch (lexicalAnalyzer.getCurToken()) {
            case OR:
                res.children.add(EPrime());
                break;
            case RPAREN:
            case END:
                // eps;
                break;
            default:
                throw new ParseException("unexpected char : " + lexicalAnalyzer.getCurChar(), lexicalAnalyzer.getCurPos());
        }
        return res;
    }

    private Node B() throws ParseException {
        Node res = new Node("B");
        switch (lexicalAnalyzer.getCurToken()) {
            case XOR:
                res.children.add(XPrime());
                break;
            case OR:
            case RPAREN:
            case END:
                // eps
                break;
            default:
                throw new ParseException("unexpected char : " + lexicalAnalyzer.getCurChar(), lexicalAnalyzer.getCurPos());
        }
        return res;
    }

    private Node A() throws ParseException {
        Node res = new Node("A");
        switch (lexicalAnalyzer.getCurToken()) {
            case AND:
                res.children.add(CPrime());
                break;
            case XOR:
            case OR:
            case RPAREN:
            case END:
                // eps
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
                res.children.add(O());
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
                res.children.add(B());
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
                res.children.add(N());
                res.children.add(A());
                break;
            default:
                throw new ParseException("unexpected char : " + lexicalAnalyzer.getCurChar(), lexicalAnalyzer.getCurPos());
        }
        return res;
    }
}
