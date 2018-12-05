package expression;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class While implements Expression {
    private LogicExpression condition;
    private List<Expression> expressions;

    public While(LogicExpression condition, List<Expression> expressions) {
        this.condition = condition;
        this.expressions = expressions;
    }

    @Override
    public String expressionToString(int level, Set<String> vars) throws Exception {
        StringBuilder indention = new StringBuilder();
        for (int i = 0; i < level; i++) {
            indention.append("    ");
        }

        StringBuilder res = new StringBuilder();
        res.append(indention).append("while ").append(condition).append(" {").append(System.lineSeparator());
        Set<String> copy = new HashSet<>(vars);
        for (Expression expression : expressions) {
            res.append(expression.expressionToString(level + 1, copy));
        }
        res.append(indention).append("}").append(System.lineSeparator());

        return res.toString();
    }
}
