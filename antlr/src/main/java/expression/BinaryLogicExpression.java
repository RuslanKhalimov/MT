package expression;

public class BinaryLogicExpression implements LogicExpression {
    private String operation;
    private LogicExpression left;
    private LogicExpression right;

    public BinaryLogicExpression(String operation, LogicExpression left, LogicExpression right) {
        this.operation = operation;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "(" + left + " " + operation + " " + right + ")";
    }
}
