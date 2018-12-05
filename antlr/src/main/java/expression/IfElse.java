package expression;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IfElse implements Expression {
    private LogicExpression condition;
    private List<Expression> first;
    private List<Expression> second;

    public IfElse(LogicExpression condition, List<Expression> first, List<Expression> second) {
        this.condition = condition;
        this.first = first;
        this.second = second;
    }

    @Override
    public String expressionToString(int level, Set<String> vars) throws Exception {
        StringBuilder indention = new StringBuilder();
        for (int i = 0; i < level; i++) {
            indention.append("    ");
        }
        StringBuilder res = new StringBuilder();

        res.append(indention).append("if ");
        res.append(condition);
        res.append(" {").append(System.lineSeparator());

        addExpressions(res, vars, level, first);
        res.append(indention).append("} else {").append(System.lineSeparator());

        addExpressions(res, vars, level, second);
        res.append(indention).append("}").append(System.lineSeparator());

        return res.toString();
    }

    private void addExpressions(StringBuilder res, Set<String> vars, int level, List<Expression> expressions) throws Exception {
        Set<String> copy = new HashSet<>(vars);
        for (Expression expression : expressions) {
            res.append(expression.expressionToString(level + 1, copy));
        }
    }
}
