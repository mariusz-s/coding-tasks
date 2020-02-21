package pl.softwarie.leetcode.algorithms.easy;

/**
 * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 */
public class TwoSumII {

    public int[] twoSum(int[] numbers, int target) {
        if (numbers == null || numbers.length == 0) {
            return new int[]{};
        }
        int start = 0;
        int end = numbers.length - 1;
        while (start < end) {
            int x = numbers[start] + numbers[end];
            if (x < target) {
                ++start;
            } else if (x > target) {
                end--;
            } else {
                return new int[]{start + 1, end + 1};
            }
        }
        return null;
    }
}
