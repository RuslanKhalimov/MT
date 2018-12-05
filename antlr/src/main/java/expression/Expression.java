package expression;

import java.util.Set;

public interface Expression {
    String expressionToString(int level, Set<String> vars) throws Exception;
}
