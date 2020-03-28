package pl.softwarie.leetcode.algorithms.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/problems/intersection-of-two-arrays-ii/
 */
public class IntersectionOfTwoArraysII {

    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> counters = new HashMap<>();
        List<Integer> intersection = new ArrayList<>();
        for (int num : nums1) {
            counters.put(num, counters.getOrDefault(num, 0) + 1);
        }
        for (int num : nums2) {
            Integer val = counters.get(num);
            if (val != null && val > 0) {
                counters.put(num, val - 1);
                intersection.add(num);
            }
        }
        int[] result = new int[intersection.size()];
        for (int i = 0; i < intersection.size(); i++) {
            result[i] = intersection.get(i);
        }
        return result;
    }
}
