package pl.softwarie.leetcode.algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/pascals-triangle-ii/
 */
public class PascalTriangleII {
    public List<Integer> getRow(int k) {
        if (k < 0) {
            return new ArrayList<>();
        }
        List<Integer> row = new ArrayList<>();
        if (k == 0) {
            row.add(1);
            return row;
        }
        row = getRow(k - 1);
        row.add(0);
        int current;
        int previousValue = 0;
        for (int i = 0; i <= k; i++) {
            current = row.get(i);
            row.set(i, row.get(i) + previousValue);
            previousValue = current;
        }
        return row;
    }
}
