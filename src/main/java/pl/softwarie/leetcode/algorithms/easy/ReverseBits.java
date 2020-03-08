package pl.softwarie.leetcode.algorithms.easy;

/**
 * https://leetcode.com/problems/reverse-bits/
 */
public class ReverseBits {

    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++, n >>= 1) {
            result = (result << 1) | (n & 1);
        }
        return result;
    }
}
