package pl.softwarie.leetcode.algorithms.easy;

/**
 * https://leetcode.com/problems/valid-palindrome-ii/
 */
public class ValidPalindromeII {

    public boolean isPalindromeRange(String s, int i, int j) {
        for (int k = i; k <= i + (j - i) / 2; k++) {
            if (s.charAt(k) != s.charAt(j - k + i)) {
                return false;
            }
        }
        return true;
    }

    public boolean validPalindrome(String s) {
        int length = s.length();
        int j;
        for (int i = 0; i < length / 2; i++) {
            j = length - 1 - i;
            if (s.charAt(i) != s.charAt(j)) {
                return isPalindromeRange(s, i + 1, j) || isPalindromeRange(s, i, j - 1);
            }
        }
        return true;
    }
}
