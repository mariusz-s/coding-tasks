package pl.softwarie.leetcode.algorithms.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/k-diff-pairs-in-an-array/
 */
public class KDiffPairsInArray {

    public int findPairs(int[] nums, int k) {

        if (nums == null || nums.length == 0 || k < 0) {
            return 0;
        }
        int count = 0;
        Map<Integer, Integer> mapping = new HashMap<>();
        for (int n : nums) {
            mapping.put(n, mapping.getOrDefault(n, 0) + 1);
        }
        boolean isZero = (k == 0);
        for (int n : mapping.keySet()) {
            if ((isZero && mapping.get(n) > 1) || (!isZero && mapping.containsKey(n - k))) {
                count++;
            }
        }
        return count;
    }
}
