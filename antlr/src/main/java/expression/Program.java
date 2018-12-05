package expression;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Program {
    private List<Expression> expressions;

    public Program(List<Expression> expressions) {
        this.expressions = expressions;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("#include <stdio.h>").append(System.lineSeparator()).append(System.lineSeparator());

        res.append("int read_int() {").append(System.lineSeparator());
        res.append("    int x;").append(System.lineSeparator());
        res.append("    scanf(\"%d\", &x);").append(System.lineSeparator());
        res.append("    return x;").append(System.lineSeparator());
        res.append("}").append(System.lineSeparator()).append(System.lineSeparator());

        res.append("int main() {").append(System.lineSeparator());

        Set<String> vars = new HashSet<>();
        for (Expression expression : expressions) {
            try {
                res.append(expression.expressionToString(1, vars));
            } catch (Exception e) {
                return e.getMessage();
            }
        }

        res.append("    return 0;").append(System.lineSeparator());
        res.append("}");
        return res.toString();
    }
}
