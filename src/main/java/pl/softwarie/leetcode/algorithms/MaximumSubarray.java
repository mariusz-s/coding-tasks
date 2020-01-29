package pl.softwarie.leetcode.algorithms;

/**
 * https://leetcode.com/problems/maximum-subarray/
 */
public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int localMax = 0;
        int globalMax = Integer.MIN_VALUE;
        for (int num : nums) {
            localMax = Math.max(num, num + localMax);
            if (localMax > globalMax) {
                globalMax = localMax;
            }
        }
        return globalMax;
    }
}
