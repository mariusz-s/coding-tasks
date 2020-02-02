package pl.softwarie.leetcode.algorithms;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> generate(int n) {
        if (n <= 0) {
            return new ArrayList<>();
        }
        List<Integer> lastRow = new ArrayList<>();
        if (n == 1) {
            List<List<Integer>> result = new ArrayList<>();
            lastRow.add(1);
            result.add(lastRow);
            return result;
        }
        List<List<Integer>> previousResult = generate(n - 1);
        List<Integer> previousRow = previousResult.get(previousResult.size() - 1);
        for (int i = 0; i < n; i++) {
            lastRow.add(getOrDefault(previousRow, i - 1) + getOrDefault(previousRow, i));
        }
        previousResult.add(lastRow);
        return previousResult;
    }

    private int getOrDefault(List<Integer> list, int index) {
        if (index >= 0 && index < list.size()) {
            return list.get(index);
        }
        return 0;
    }
}
