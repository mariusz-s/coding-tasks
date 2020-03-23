package pl.softwarie.leetcode.algorithms.easy;

/**
 * https://leetcode.com/problems/sum-of-two-integers/
 */
public class SumOfTwoIntegers {

    public int getSum(int x, int y) {
        while (y != 0) {
            int carry = x & y;
            x = x ^ y;
            y = carry << 1;
        }
        return x;
    }
}
