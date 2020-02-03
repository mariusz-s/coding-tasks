package pl.softwarie.leetcode.algorithms.easy;

class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x < 10) {
            return true;
        }
        int[] digits = new int[(int) Math.log10(x) + 1];
        int i = 0;
        while (x > 0) {
            digits[i] = (x % 10);
            x = x / 10;
            i++;
        }
        i = 0;
        int j = digits.length - 1;
        while (j > i) {
            if (digits[i] != digits[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
