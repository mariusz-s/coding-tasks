package pl.softwarie.hackerrank.algorithms;

import org.junit.Test;
import pl.softwarie.hackerrank.BaseTest;

import static org.assertj.core.api.Assertions.assertThat;

public class SolveMeFirstTest extends BaseTest {

    @Test
    public void shouldAddTwoNumbers() {
        //having
        setStreams(new String[]{"2", "5"});

        //when
        SolveMeFirst.main(new String[]{});
        String result = getSingleLineOutput();

        //then
        assertThat(result).isEqualTo("7");
    }
}
