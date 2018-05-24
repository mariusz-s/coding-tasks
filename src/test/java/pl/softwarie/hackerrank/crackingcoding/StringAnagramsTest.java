package pl.softwarie.hackerrank.crackingcoding;

import org.junit.Test;
import pl.softwarie.hackerrank.BaseTest;

import static org.assertj.core.api.Assertions.assertThat;

public class StringAnagramsTest extends BaseTest {

    @Test
    public void shouldSolveSample() {
        //having
        setStreams(new String[]{
                "cde",
                "abc"
        });

        //when
        StringAnagrams.main(new String[]{});
        String result = getSingleLineOutput();

        //then
        assertThat(result).isEqualTo("4");
    }
}