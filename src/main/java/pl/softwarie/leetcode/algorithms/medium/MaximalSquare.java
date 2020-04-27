package pl.softwarie.leetcode.algorithms.medium;

/**
 * https://leetcode.com/problems/maximal-square/
 */
public class MaximalSquare {

    public int maximalSquare(char[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return 0;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int[] dp = new int[n + 1];
        int length = 0, previous = 0;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                int tmp = dp[j];
                if (matrix[i - 1][j - 1] == '1') {
                    dp[j] = Math.min(Math.min(dp[j - 1], previous), dp[j]) + 1;
                    length = Math.max(length, dp[j]);
                } else {
                    dp[j] = 0;
                }
                previous = tmp;
            }
        }
        return length * length;
    }
}
