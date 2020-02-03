package pl.softwarie.leetcode.algorithms.easy;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TwoSumTest {

    @Test
    public void twoSum1() {
        // having
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;

        // when
        int[] indices = TwoSum.twoSum(nums, target);

        // then
        assertThat(indices).containsExactly(0, 1);
    }

    @Test
    public void twoSum2() {
        // having
        int[] nums = new int[]{-3, 4, 3, 90};
        int target = 0;

        // when
        int[] indices = TwoSum.twoSum(nums, target);

        // then
        assertThat(indices).containsExactly(0, 2);
    }
}