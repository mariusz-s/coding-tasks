package pl.softwarie.leetcode.algorithms.easy;

/**
 * https://leetcode.com/problems/add-digits/
 */
public class AddDigits {

    public int addDigits(int num) {
        if (num == 0) {
            return num;
        }
        return (num % 9) == 0 ? 9 : (num % 9);
    }
}
