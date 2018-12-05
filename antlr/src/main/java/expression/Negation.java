package expression;

public class Negation implements LogicExpression {
    private LogicExpression expression;

    public Negation(LogicExpression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "!" + expression;
    }
}
