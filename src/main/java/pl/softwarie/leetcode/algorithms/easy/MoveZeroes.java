package pl.softwarie.leetcode.algorithms.easy;

/**
 * https://leetcode.com/problems/move-zeroes/
 */
public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        for (int lastZero = 0, i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int tmp = nums[lastZero];
                nums[lastZero++] = nums[i];
                nums[i] = tmp;
            }
        }
    }
}
