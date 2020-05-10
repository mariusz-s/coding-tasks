package pl.softwarie.leetcode.algorithms.easy;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class ReverseWordsInStringIIITest {

    private final ReverseWordsInStringIII solution = new ReverseWordsInStringIII();

    @Test
    public void shouldReverseWords() {
        // when
        String result = solution.reverseWords("Let's take LeetCode contest");

        // then
        assertThat(result).isEqualTo("s'teL ekat edoCteeL tsetnoc");
    }
}