package expression;

import java.util.List;
import java.util.Set;

public class Assignment implements Expression {
    private List<Variable> variables;
    private List<ArithmeticExpression> expressions;

    public Assignment(List<Variable> variables, List<ArithmeticExpression> expressions) {
        this.variables = variables;
        this.expressions = expressions;
    }

    @Override
    public String expressionToString(int level, Set<String> vars) throws Exception {
        if (variables.size() != expressions.size()) {
            throw new Exception("Invalid assignment");
        }
        if (variables.size() == 1) {
            return singleAssignmentToString(level, variables.get(0), expressions.get(0), vars);
        }

        StringBuilder res = new StringBuilder();
        for (int i = 0; i < variables.size(); i++) {
            res.append(singleAssignmentToString(level, new Variable("_" + variables.get(i)), expressions.get(i), vars));
        }

        for (Variable var : variables) {
            res.append(singleAssignmentToString(level, var, new Variable("_" + var), vars));
        }

        return res.toString();
    }

    private String singleAssignmentToString(int level, Variable variable, ArithmeticExpression expression, Set<String> vars) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < level; i++) {
            res.append("    ");
        }

        if (!vars.contains(variable.toString())) {
            vars.add(variable.toString());
            res.append("int ");
        }
        res.append(variable).append(" = ").append(expression).append(";").append(System.lineSeparator());
        return res.toString();
    }
}
