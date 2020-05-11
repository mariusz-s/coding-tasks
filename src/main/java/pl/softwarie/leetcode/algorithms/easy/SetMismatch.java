package pl.softwarie.leetcode.algorithms.easy;

/**
 * https://leetcode.com/problems/set-mismatch/
 */
public class SetMismatch {

    public int[] findErrorNums(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[]{};
        }
        int duplicate = -1;
        for (int n : nums) {
            if (nums[Math.abs(n) - 1] < 0) {
                duplicate = Math.abs(n);
            } else {
                nums[Math.abs(n) - 1] *= -1;
            }
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > 0) {
                return new int[]{duplicate, i + 1};
            }
        }
        return new int[]{duplicate, 1};
    }
}
