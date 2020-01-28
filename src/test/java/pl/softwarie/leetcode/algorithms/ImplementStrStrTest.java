package pl.softwarie.leetcode.algorithms;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ImplementStrStrTest {

    @Test
    public void shouldFindSubString() {
        // given
        String haystack = "mississippi";
        String needle = "issip";

        // when
        int index = ImplementStrStr.strStr(haystack, needle);

        // then
        assertThat(index).isEqualTo(4);
    }
}
