package pl.softwarie.leetcode.algorithms.easy;

/**
 * https://leetcode.com/problems/power-of-four/
 */
public class PowerOfFour {

    public boolean isPowerOfFour(int n) {
        int bits = 0;
        int x = n & (n - 1);

        if (n > 0 && x == 0) {
            while (n > 1) {
                n >>= 1;
                bits += 1;
            }
            return bits % 2 == 0;
        }
        return false;
    }
}
