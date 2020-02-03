package pl.softwarie.leetcode.algorithms.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/two-sum/
 */
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> cache = new HashMap<>();

        if (0 == nums.length) {
            return new int[]{};
        }

        for (int i = 0; i < nums.length; i++) {
            if (cache.containsKey(nums[i])) {
                return new int[]{cache.get(nums[i]), i};
            }
            cache.put(target - nums[i], i);
        }

        return new int[]{};
    }
}
