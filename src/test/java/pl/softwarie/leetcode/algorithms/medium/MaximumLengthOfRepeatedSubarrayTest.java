package pl.softwarie.leetcode.algorithms.medium;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MaximumLengthOfRepeatedSubarrayTest {

    private final MaximumLengthOfRepeatedSubarray solution = new MaximumLengthOfRepeatedSubarray();

    @Test
    public void shouldFindMaxLength() {
        // when
        int maxLength = solution.findLength(new int[]{0, 1, 1, 1, 1}, new int[]{1, 0, 1, 0, 1});

        // then
        assertThat(maxLength).isEqualTo(2);
    }
}