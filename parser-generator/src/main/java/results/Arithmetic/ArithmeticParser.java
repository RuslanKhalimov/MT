package results.Arithmetic;

import java.text.ParseException;

public class ArithmeticParser {
    ArithmeticLexer lexer;

    public AddSub parse(String input) throws ParseException {
        lexer = new ArithmeticLexer(input);
        lexer.nextToken();
        AddSub result = addSub();
        if(lexer.getCurToken() != ArithmeticToken.END) {
            throw new ParseException("Unexpected token : " + lexer.getCurToken(), lexer.getCurPos());
        }
        return result;
    }

    private AddSub addSub() throws ParseException {
        AddSub result = new AddSub();
        switch(lexer.getCurToken()) {
            case OP:
            case NUM:
            {
                MulDiv mulDiv = mulDiv();
                AddSub_ addSub_ = addSub_(mulDiv.v);
                result.v = addSub_.v;
                break;
            }
            default:
                throw new ParseException("Unexpected token : " + lexer.getCurToken(), lexer.getCurPos());
        }
        return result;
    }

    private AddSub_ addSub_(int left) throws ParseException {
        AddSub_ result = new AddSub_();
        switch(lexer.getCurToken()) {
            case ADD:
            {
                String ADD = check(ArithmeticToken.ADD);
                MulDiv mulDiv = mulDiv();
                int next = left + mulDiv.v;
                AddSub_ addSub_ = addSub_(next);
                result.v = addSub_.v;
                break;
            }
            case SUB:
            {
                String SUB = check(ArithmeticToken.SUB);
                MulDiv mulDiv = mulDiv();
                int next = left - mulDiv.v;
                AddSub_ addSub_ = addSub_(next);
                result.v = addSub_.v;
                break;
            }
            case END:
            case CP:
            {
                result.v = left;
                break;
            }
            default:
                throw new ParseException("Unexpected token : " + lexer.getCurToken(), lexer.getCurPos());
        }
        return result;
    }

    private MulDiv mulDiv() throws ParseException {
        MulDiv result = new MulDiv();
        switch(lexer.getCurToken()) {
            case OP:
            case NUM:
            {
                Pow pow = pow();
                MulDiv_ mulDiv_ = mulDiv_(pow.v);
                result.v = mulDiv_.v;
                break;
            }
            default:
                throw new ParseException("Unexpected token : " + lexer.getCurToken(), lexer.getCurPos());
        }
        return result;
    }

    private MulDiv_ mulDiv_(int left) throws ParseException {
        MulDiv_ result = new MulDiv_();
        switch(lexer.getCurToken()) {
            case MUL:
            {
                String MUL = check(ArithmeticToken.MUL);
                Pow pow = pow();
                MulDiv_ mulDiv_ = mulDiv_(left * pow.v);
                result.v = mulDiv_.v;
                break;
            }
            case DIV:
            {
                String DIV = check(ArithmeticToken.DIV);
                Pow pow = pow();
                MulDiv_ mulDiv_ = mulDiv_(left / pow.v);
                result.v = mulDiv_.v;
                break;
            }
            case ADD:
            case SUB:
            case END:
            case CP:
            {
                result.v = left;
                break;
            }
            default:
                throw new ParseException("Unexpected token : " + lexer.getCurToken(), lexer.getCurPos());
        }
        return result;
    }

    private Pow pow() throws ParseException {
        Pow result = new Pow();
        switch(lexer.getCurToken()) {
            case OP:
            case NUM:
            {
                Unary unary = unary();
                Pow_ pow_ = pow_(unary.v);
                result.v = pow_.v;
                break;
            }
            default:
                throw new ParseException("Unexpected token : " + lexer.getCurToken(), lexer.getCurPos());
        }
        return result;
    }

    private Pow_ pow_(int left) throws ParseException {
        Pow_ result = new Pow_();
        switch(lexer.getCurToken()) {
            case POW:
            {
                String POW = check(ArithmeticToken.POW);
                Pow pow = pow();
                result.v = (int) Math.pow(left, pow.v);
                break;
            }
            case DIV:
            case ADD:
            case SUB:
            case MUL:
            case END:
            case CP:
            {
                result.v = left;
                break;
            }
            default:
                throw new ParseException("Unexpected token : " + lexer.getCurToken(), lexer.getCurPos());
        }
        return result;
    }

    private Unary unary() throws ParseException {
        Unary result = new Unary();
        switch(lexer.getCurToken()) {
            case OP:
            {
                String OP = check(ArithmeticToken.OP);
                AddSub addSub = addSub();
                String CP = check(ArithmeticToken.CP);
                result.v = addSub.v;
                break;
            }
            case NUM:
            {
                String NUM = check(ArithmeticToken.NUM);
                result.v = Integer.valueOf(NUM);
                break;
            }
            default:
                throw new ParseException("Unexpected token : " + lexer.getCurToken(), lexer.getCurPos());
        }
        return result;
    }

    private String check(ArithmeticToken token) throws ParseException {
        if (token != lexer.getCurToken()) {
            throw new ParseException("Unexpected token : " + lexer.getCurToken(), lexer.getCurPos());
        }
        String res = lexer.getCurTokenString();
        lexer.nextToken();
        return res;
    }

    public class AddSub {
        public int v;
    }

    public class AddSub_ {
        public int v;
    }

    public class MulDiv {
        public int v;
    }

    public class MulDiv_ {
        public int v;
    }

    public class Pow {
        public int v;
    }

    public class Pow_ {
        public int v;
    }

    public class Unary {
        public int v;
    }

}
