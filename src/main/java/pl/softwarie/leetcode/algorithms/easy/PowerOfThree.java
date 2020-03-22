package pl.softwarie.leetcode.algorithms.easy;

/**
 * https://leetcode.com/problems/power-of-three/
 */
public class PowerOfThree {

    public boolean isPowerOfThree(int n) {
        return n > 0 && 1162261467 % n == 0;
    }
}
