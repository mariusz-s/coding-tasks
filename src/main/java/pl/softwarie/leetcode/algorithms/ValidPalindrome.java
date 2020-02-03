package pl.softwarie.leetcode.algorithms;

/**
 * https://leetcode.com/problems/valid-palindrome/
 */
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if (s == null || s.isEmpty()) {
            return true;
        }
        int start = 0;
        int end = s.length() - 1;
        while (start <= end) {
            char a = s.charAt(start);
            char b = s.charAt(end);
            if (!Character.isLetterOrDigit(a)) {
                start++;
                continue;
            }
            if (!Character.isLetterOrDigit(b)) {
                end--;
                continue;
            }
            if (Character.toLowerCase(a) != Character.toLowerCase(b)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
