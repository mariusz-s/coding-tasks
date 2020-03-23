package pl.softwarie.leetcode.algorithms.easy;

/**
 * https://leetcode.com/problems/valid-perfect-square/
 */
public class ValidPerfectSquare {

    public boolean isPerfectSquare(int num) {
        if (num < 0) {
            return false;
        }
        if (num <= 1) {
            return true;
        }
        long i = 2;
        long j = num;
        while (i <= j) {
            long k = i + (j - i) / 2;
            long m = k * k;
            if (m == num) {
                return true;
            } else if (m > num) {
                j = k - 1;
            } else {
                i = k + 1;
            }
        }
        return false;
    }
}
