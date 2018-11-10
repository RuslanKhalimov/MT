import java.io.*;

public class GraphvizUtils {
    public static void visualizeTree(Node tree, String name) throws IOException, InterruptedException {
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(name + ".dot")))) {
            writer.write("digraph " + name + " {\n");
            printGraph(tree, 0, writer);
            writer.write("}\n");
        }
        makePng(name);
    }

    private static String printNode(Node tree, int id, BufferedWriter writer) throws IOException {
        String vertexName = "A" + id;
        writer.write(vertexName + "[label=\"" + tree.type + "\"");
        if (tree.isTerminal()) {
            writer.write(",color=red");
        }
        writer.write("]\n");
        return vertexName;
    }

    private static int printGraph(Node tree, int id, BufferedWriter writer) throws IOException {
        String vertexName = printNode(tree, id, writer);
        int nextId = id;
        for (Node child : tree.children) {
            nextId++;
            String nextVertexName = "A" + nextId;
            writer.write(vertexName + "->" + nextVertexName);
            writer.newLine();
            nextId = printGraph(child, nextId, writer);
        }
        return nextId;
    }

    private static void makePng(String name) throws IOException, InterruptedException {
        new ProcessBuilder( "dot", "-Tpng", (name + ".dot"))
                .redirectOutput(new File(name + ".png"))
                .start()
                .waitFor();
    }
}
