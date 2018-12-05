package expression;

import java.util.List;
import java.util.Set;

public class Print implements Expression {
    private List<ArithmeticExpression> expressions;

    public Print(List<ArithmeticExpression> expressions) {
        this.expressions = expressions;
    }

    @Override
    public String expressionToString(int level, Set<String> vars) throws Exception {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < level; i++) {
            res.append("    ");
        }

        res.append("printf(\"%d");
        for (int i = 1; i < expressions.size(); i++) {
            res.append(" %d");
        }
        res.append("\"");
        for (ArithmeticExpression expression : expressions) {
            res.append(", ").append(expression);
        }
        res.append(");").append(System.lineSeparator());

        return res.toString();
    }
}
