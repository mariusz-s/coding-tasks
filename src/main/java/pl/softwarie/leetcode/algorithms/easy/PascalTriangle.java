package pl.softwarie.leetcode.algorithms.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/pascals-triangle
 */
public class PascalTriangle {
    public List<List<Integer>> generate(int n) {
        if (n <= 0) {
            return new ArrayList<>();
        }
        List<Integer> newRow = new ArrayList<>();
        if (n == 1) {
            List<List<Integer>> result = new ArrayList<>();
            newRow.add(1);
            result.add(newRow);
            return result;
        }
        List<List<Integer>> previousResult = generate(n - 1);
        List<Integer> previousRow = previousResult.get(previousResult.size() - 1);
        for (int i = 0; i < n; i++) {
            newRow.add(getOrDefault(previousRow, i - 1) + getOrDefault(previousRow, i));
        }
        previousResult.add(newRow);
        return previousResult;
    }

    private int getOrDefault(List<Integer> list, int index) {
        if (index >= 0 && index < list.size()) {
            return list.get(index);
        }
        return 0;
    }
}
