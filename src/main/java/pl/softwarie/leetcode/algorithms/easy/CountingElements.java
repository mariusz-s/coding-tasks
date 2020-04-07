package pl.softwarie.leetcode.algorithms.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/explore/other/card/30-day-leetcoding-challenge/528/week-1/3289/
 */
public class CountingElements {

    public int countElements(int[] arr) {
        Map<Integer, Integer> counters = new HashMap<>();
        for (int i : arr) {
            counters.put(i + 1, counters.getOrDefault(i + 1, 0) + 1);
        }
        int count = 0;
        for (int i : arr) {
            int tmp = counters.getOrDefault(i, 0);
            count += tmp;
            if (tmp > 0) {
                counters.remove(i);
            }
        }
        return count;
    }
}
