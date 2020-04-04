package pl.softwarie.leetcode.algorithms.easy;

/**
 * https://leetcode.com/problems/repeated-substring-pattern/
 */
public class RepeatedSubstringPattern {

    public boolean repeatedSubstringPattern(String s) {
        int l = s.length();
        int[] next = new int[l];
        next[0] = -1;
        int i, j = -1;
        for (i = 1; i < l; i++) {
            while (j >= 0 && s.charAt(i) != s.charAt(j + 1)) {
                j = next[j];
            }
            if (s.charAt(i) == s.charAt(j + 1)) {
                j++;
            }
            next[i] = j;
        }
        int len = l - 1 - next[l - 1];
        return len != l && l % len == 0;
    }
}
