package pl.softwarie.leetcode.algorithms;

/**
 * https://leetcode.com/problems/plus-one/
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        if (digits == null || digits.length == 0) {
            return new int[]{1};
        }
        digits[digits.length - 1]++;
        for (int i = digits.length - 1; i > 0; i--) {
            if (digits[i] >= 10) {
                digits[i - 1]++;
            }
            digits[i] = digits[i] % 10;
        }
        if (digits[0] >= 10) {
            int[] newArray = new int[digits.length + 1];
            newArray[0] = 1;
            return newArray;
        }
        return digits;
    }
}
