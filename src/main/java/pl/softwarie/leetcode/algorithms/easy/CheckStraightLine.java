package pl.softwarie.leetcode.algorithms.easy;

/**
 * https://leetcode.com/problems/check-if-it-is-a-straight-line/
 */
public class CheckStraightLine {

    public boolean checkStraightLine(int[][] coordinates) {
        if (coordinates == null || coordinates.length == 0) {
            return false;
        }
        if (coordinates.length == 2) {
            return true;
        }
        for (int i = 2; i < coordinates.length; i++) {
            if (onLine(coordinates[i], coordinates[0], coordinates[1])) {
                continue;
            }
            return false;
        }
        return true;
    }

    public boolean onLine(int[] a, int[] b, int[] c) {
        int x = a[0], y = a[1], x1 = b[0], y1 = b[1], x2 = c[0], y2 = c[1];
        return ((y - y1) * (x2 - x1) == (y2 - y1) * (x - x1));
    }
}
