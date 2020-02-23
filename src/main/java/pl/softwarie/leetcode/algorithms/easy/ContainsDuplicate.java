package pl.softwarie.leetcode.algorithms.easy;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/contains-duplicate/
 */
public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        return nums != null && nums.length != Arrays.stream(nums).distinct().count();
    }
}
