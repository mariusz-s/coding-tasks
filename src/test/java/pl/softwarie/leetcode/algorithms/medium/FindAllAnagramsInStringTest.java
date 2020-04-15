package pl.softwarie.leetcode.algorithms.medium;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class FindAllAnagramsInStringTest {

    private final FindAllAnagramsInString solution = new FindAllAnagramsInString();

    @Test
    public void shouldFindAllAnagrams() {
        // when
        List<Integer> result = solution.findAnagrams("cbaebabacd", "abc");

        // then
        assertThat(result).containsExactly(0, 6);
    }

    @Test
    public void shouldFindAllAnagrams2() {
        // when
        List<Integer> result = solution.findAnagrams("abab", "ab");

        // then
        assertThat(result).containsExactly(0, 1, 2);
    }
}