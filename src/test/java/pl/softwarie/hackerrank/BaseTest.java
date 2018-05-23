package pl.softwarie.hackerrank;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class BaseTest {

    private ByteArrayOutputStream output = new ByteArrayOutputStream();

    protected void setStreams(String[] input) {
        System.out.flush();

        ByteArrayInputStream in = new ByteArrayInputStream(String.join(System.lineSeparator(), input).getBytes());
        System.setIn(in);

        System.setOut(new PrintStream(output));
    }

    protected String getOutput() {
        return output.toString();
    }

    protected String getSingleLineOutput() {
        return getOutput().replaceAll("[\\r\\n]", "");
    }
}
