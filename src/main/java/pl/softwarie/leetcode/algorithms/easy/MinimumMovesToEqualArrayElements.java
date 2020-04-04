package pl.softwarie.leetcode.algorithms.easy;

/**
 * https://leetcode.com/problems/minimum-moves-to-equal-array-elements/
 */
public class MinimumMovesToEqualArrayElements {

    public int minMoves(int[] nums) {
        int currentsum = 0;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            currentsum += num;
            min = Math.min(min, num);
        }
        return currentsum - nums.length * min;
    }
}
