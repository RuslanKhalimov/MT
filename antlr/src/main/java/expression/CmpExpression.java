package expression;

public class CmpExpression implements LogicExpression {
    private String operation;
    private ArithmeticExpression left;
    private ArithmeticExpression right;

    public CmpExpression(String operation, ArithmeticExpression left, ArithmeticExpression right) {
        this.operation = operation;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "(" + left + " " + operation + " " + right + ")";
    }
}
