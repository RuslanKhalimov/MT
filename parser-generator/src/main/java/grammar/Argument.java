package grammar;

public class Argument {
    private String name;
    private String type;

    public Argument(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }
}
