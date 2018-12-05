import java.io.*;

import expression.Program;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import org.junit.Test;

public class ParserTest {
    private void runTest(String name) {
        try (BufferedWriter writer =
                     new BufferedWriter(new OutputStreamWriter(new FileOutputStream("tests_output/" + name + ".c")));
             BufferedReader reader =
                     new BufferedReader(new InputStreamReader(new FileInputStream("tests_input/" + name)))
        ) {
            StringBuilder code = new StringBuilder();
            String next;
            while ((next = reader.readLine()) != null) {
                code.append(next).append("\n");
            }
            runTest(code.toString(), writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void runTest(String code, BufferedWriter writer) throws IOException {
        ProgramLexer lexer = new ProgramLexer(CharStreams.fromString(code));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ProgramParser parser = new ProgramParser(tokens);
        Program program = parser.start().v;
        writer.write(program.toString());
    }

    @Test
    public void assignTest() {
        runTest("assign");
    }

    @Test
    public void arithmeticTest() {
        runTest("arithmetic");
    }

    @Test
    public void printTest() {
        runTest("print");
    }

    @Test
    public void readTest() {
        runTest("read");
    }

    @Test
    public void ifTest() {
        runTest("if");
    }

    @Test
    public void ifElseTest() {
        runTest("if_else");
    }

    @Test
    public void whileTest() {
        runTest("while");
    }

    @Test
    public void doWhileTest() {
        runTest("do_while");
    }

    @Test
    public void sampleTest() {
        runTest("sample");
    }
}
