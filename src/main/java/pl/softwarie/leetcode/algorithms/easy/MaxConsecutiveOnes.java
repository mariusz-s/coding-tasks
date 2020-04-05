package pl.softwarie.leetcode.algorithms.easy;

/**
 * https://leetcode.com/problems/max-consecutive-ones/
 */
public class MaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int current = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                current++;
                continue;
            }
            if (max < current) {
                max = current;
            }
            if (max > nums.length - i) {
                return max;
            }
            current = 0;
        }
        return Math.max(max, current);
    }
}
