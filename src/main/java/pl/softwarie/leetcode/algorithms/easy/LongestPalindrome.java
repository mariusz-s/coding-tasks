package pl.softwarie.leetcode.algorithms.easy;

/**
 * https://leetcode.com/problems/longest-palindrome/
 */
public class LongestPalindrome {

    public int longestPalindrome(String s) {
        int[] count = new int[128];
        for (char c : s.toCharArray()) {
            count[c]++;
        }
        int result = 0;
        for (int c : count) {
            result += c / 2 * 2;
            if (result % 2 == 0 && c % 2 == 1) {
                result++;
            }
        }
        return result;
    }
}
