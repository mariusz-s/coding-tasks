package pl.softwarie.leetcode.algorithms.easy;

/**
 * https://leetcode.com/problems/missing-number/
 */
public class MissingNumber {

    public int missingNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        long sum = nums.length * (nums.length + 1) / 2;
        for (int num : nums) {
            sum -= num;
        }
        return (int) sum;
    }
}
