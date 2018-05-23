package pl.softwarie.hackerrank.java;

import org.junit.Test;
import pl.softwarie.hackerrank.BaseTest;

import static org.assertj.core.api.Assertions.assertThat;

public class PatternSyntaxTest extends BaseTest {

    @Test
    public void shouldPrintValidLabels1() {
        //having
        setStreams(new String[]{
                "3",
                "([A-Z])(.+)",
                "[AZ[a-z](a-z)",
                "batcatpat(nat"
        });

        //when
        PatternSyntax.main(new String[]{});
        String result = getOutput();

        //then
        assertThat(result).isEqualTo("Valid\r\nInvalid\r\nInvalid\r\n");
    }
}
