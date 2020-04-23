package pl.softwarie.leetcode.algorithms.medium;

/**
 * https://leetcode.com/problems/bitwise-and-of-numbers-range/submissions/
 */
public class BitwiseAndOfNumbersRange {

    public int rangeBitwiseAnd(int m, int n) {
        while (n > m) {
            n = n & n - 1;
        }
        return n;
    }
}
