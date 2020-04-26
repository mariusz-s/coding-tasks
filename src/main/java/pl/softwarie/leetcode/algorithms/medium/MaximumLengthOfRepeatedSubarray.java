package pl.softwarie.leetcode.algorithms.medium;

/**
 * https://leetcode.com/problems/maximum-length-of-repeated-subarray/submissions/
 */
public class MaximumLengthOfRepeatedSubarray {

    public int findLength(int[] A, int[] B) {
        if (A == null || B == null) {
            return 0;
        }
        int max = 0;
        int m = A.length;
        int n = B.length;
        int[][] dp = new int[m + 1][n + 1];
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (A[i] == B[j]) {
                    dp[i][j] = dp[i + 1][j + 1] + 1;
                    max = Math.max(dp[i][j], max);
                }
            }
        }
        return max;
    }
}
