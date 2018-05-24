package pl.softwarie.hackerrank.crackingcoding;

import org.junit.Test;
import pl.softwarie.hackerrank.BaseTest;

import static org.assertj.core.api.Assertions.assertThat;

public class ArraysLeftRotationTest extends BaseTest {

    @Test
    public void shouldRotateSampleArray() {
        //having
        setStreams(new String[]{
                "5 4",
                "1 2 3 4 5"
        });

        //when
        ArraysLeftRotation.main(new String[]{});
        String result = getOutput();

        //then
        assertThat(result).isEqualTo("5 1 2 3 4");
    }
}
