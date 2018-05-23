package pl.softwarie.hackerrank.java;

import org.junit.Test;
import pl.softwarie.hackerrank.BaseTest;

import static org.assertj.core.api.Assertions.assertThat;

public class PrimeCheckerTest extends BaseTest {

    @Test
    public void shouldPrintProperPrimes() {
        //having
        setStreams(new String[]{
                "2",
                "1",
                "3",
                "4",
                "5"
        });

        //when
        PrimeChecker.main(new String[]{});
        String result = getOutput();

        //then
        assertThat(result).isEqualTo("2\r\n2\r\n2 3\r\n2 3 5\r\n");
    }

    @Test
    public void shouldPrintEmptyLineWhenNoPrime() {
        //having
        setStreams(new String[]{
                "8",
                "7",
                "5",
                "2",
                "4"
        });

        //when
        PrimeChecker.main(new String[]{});
        String result = getOutput();

        //then
        assertThat(result).isEqualTo("\r\n7\r\n7 5\r\n7 5 2\r\n");
    }
}
