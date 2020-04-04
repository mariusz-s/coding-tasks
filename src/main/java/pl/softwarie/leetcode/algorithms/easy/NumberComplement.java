package pl.softwarie.leetcode.algorithms.easy;

/**
 * https://leetcode.com/problems/number-complement/
 * https://leetcode.com/problems/complement-of-base-10-integer/
 */
public class NumberComplement {

    public int findComplement(int num) {
        if (num == 0) {
            return 1;
        }
        int tmp = num;
        int mask = 0;
        while (tmp != 0) {
            if (mask != 0) {
                mask <<= 1;
            }
            mask += 1;
            tmp >>>= 1;
        }
        return mask ^ num;
    }
}
