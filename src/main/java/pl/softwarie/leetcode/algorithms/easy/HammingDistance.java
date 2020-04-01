package pl.softwarie.leetcode.algorithms.easy;

/**
 * https://leetcode.com/problems/hamming-distance/
 */
public class HammingDistance {

    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }
}
