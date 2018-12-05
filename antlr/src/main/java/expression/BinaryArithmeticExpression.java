package expression;

public class BinaryArithmeticExpression implements ArithmeticExpression {
    private String operation;
    private ArithmeticExpression left;
    private ArithmeticExpression right;

    public BinaryArithmeticExpression(String operation, ArithmeticExpression left, ArithmeticExpression right) {
        this.operation = operation;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "(" + left + " " + operation + " " + right + ")";
    }
}
