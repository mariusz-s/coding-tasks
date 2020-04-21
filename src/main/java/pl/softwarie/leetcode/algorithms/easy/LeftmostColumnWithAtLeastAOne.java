package pl.softwarie.leetcode.algorithms.easy;

import pl.softwarie.leetcode.algorithms.common.BinaryMatrix;

import java.util.List;

/**
 * https://leetcode.com/explore/other/card/30-day-leetcoding-challenge/530/week-3/3306/
 */
public class LeftmostColumnWithAtLeastAOne {

    private static final int NOT_FOUND = -1;

    public int leftMostColumnWithOne(BinaryMatrix binaryMatrix) {
        List<Integer> dimensions = binaryMatrix.dimensions();
        int n = dimensions.get(0);
        int m = dimensions.get(1);
        if (n == 0 || m == 0) {
            return NOT_FOUND;
        }
        int column = NOT_FOUND;
        for (int x = 0, y = m - 1; x < n && y >= 0; ) {
            if (binaryMatrix.get(x, y) == 1) {
                column = y;
                y--;
            } else {
                x++;
            }
        }
        return column;
    }
}
