package pl.softwarie.leetcode.algorithms.medium;

/**
 * https://leetcode.com/problems/uncrossed-lines/
 */
public class UncrossedLines {

    public int maxUncrossedLines(int[] A, int[] B) {
        if (null == A || null == B || A.length == 0 || B.length == 0) {
            return 0;
        }
        int[][] dp = new int[A.length + 1][B.length + 1];
        for (int i = A.length - 1; i >= 0; i--) {
            for (int j = B.length - 1; j >= 0; j--) {
                if (A[i] == B[j]) {
                    dp[i][j] = dp[i + 1][j + 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i][j + 1], dp[i + 1][j]);
                }
            }

        }
        return dp[0][0];
    }
}
