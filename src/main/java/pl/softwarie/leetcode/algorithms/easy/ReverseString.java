package pl.softwarie.leetcode.algorithms.easy;

/**
 * https://leetcode.com/problems/reverse-string/submissions/
 */
public class ReverseString {

    public void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        while (left < right) {
            char tmp = s[left];
            s[left++] = s[right];
            s[right--] = tmp;
        }
    }
}
