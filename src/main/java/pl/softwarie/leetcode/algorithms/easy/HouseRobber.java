package pl.softwarie.leetcode.algorithms.easy;

/**
 * https://leetcode.com/problems/house-robber/
 */
public class HouseRobber {

    public int rob(int[] num) {
        if (num == null || num.length == 0) {
            return 0;
        }
        int even = 0;
        int odd = 0;
        for (int i = 0; i < num.length; i++) {
            if (i % 2 == 0) {
                even += num[i];
                even = Math.max(even, odd);
            } else {
                odd += num[i];
                odd = Math.max(even, odd);
            }
        }
        return Math.max(even, odd);
    }
}
