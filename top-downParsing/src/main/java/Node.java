import java.util.ArrayList;
import java.util.List;

public class Node {
    public final String type;
    public final List<Node> children;

    public Node(String type) {
        this.type = type;
        children = new ArrayList<>();
    }

    @Override
    public String toString() {
        if (isTerminal()) {
            return type;
        } else {
            StringBuilder res = new StringBuilder();
            for (Node child : children) {
                res.append(child.toString());
            }
            return res.toString();
        }
    }

    public boolean isTerminal() {
        return type.equals("^") || type.equals("|") || type.equals("&") || type.equals("!") ||
                Character.isLowerCase(type.charAt(0)) || type.equals("(") || type.equals(")");
    }
}
