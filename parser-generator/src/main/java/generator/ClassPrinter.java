package generator;

import grammar.Grammar;

import java.io.*;

public abstract class ClassPrinter {
    private String packageName;

    protected String lexerClassName;
    protected String tokenClassName;
    protected String parserClassName;
    protected Grammar grammar;

    private PrintWriter writer;
    private final String TAB = "    ";

    public ClassPrinter(String name, Grammar grammar, String path, String file) {
        try {
            writer = new PrintWriter(new File(path, file));
        } catch (IOException e) {
            e.printStackTrace();
        }

        packageName = "results." + name;
        tokenClassName = name + "Token";
        lexerClassName = name + "Lexer";
        parserClassName = name + "Parser";
        this.grammar = grammar;
    }

    protected void printLine(int indention, String ... strs) {
        for (int i = 0; i < indention; i++) {
            writer.print(TAB);
        }

        for (String s : strs) {
            writer.print(s);
        }
        writer.println();
    }

    private void printPackage() {
        printLine(0, "package ", packageName, ";");
        writer.println();
    }

    public void printFile() {
        printPackage();
        printImports();
        printClass();
        writer.close();
    }

    protected void printImport(String file) {
        printLine(0, "import ", file, ";");
    }

    protected abstract void printImports();

    protected abstract void printClass();
}
