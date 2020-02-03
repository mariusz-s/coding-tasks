package pl.softwarie.leetcode.algorithms.easy;

/**
 * https://leetcode.com/problems/sqrtx/
 */
public class SqrtBinarySearch {
    public int mySqrt(int x) {
        if (x == 1 || x == 2) {
            return 1;
        }
        int l = 0, r = x / 2;
        while (l <= r) {
            long m = l + (r - l) / 2;
            long s = m * m;
            if (s == x || ((m + 1) * (m + 1) > x && s < x)) {
                return (int) m;
            } else if (s > x) {
                r = (int) (m - 1);
            } else {
                l = (int) (m + 1);
            }
        }
        return -1;
    }
}
