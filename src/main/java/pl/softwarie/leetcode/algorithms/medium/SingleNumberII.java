package pl.softwarie.leetcode.algorithms.medium;

/**
 * https://leetcode.com/problems/single-number-ii/
 */
public class SingleNumberII {
    public int singleNumber(int[] nums) {
        int ones = 0, twos = 0;
        int common;
        for (int num : nums) {
            twos = twos | (ones & num);
            ones = ones ^ num;
            common = ~(ones & twos);
            ones &= common;
            twos &= common;
        }
        return ones;
    }
}
