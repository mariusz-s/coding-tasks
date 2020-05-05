package pl.softwarie.leetcode.algorithms.easy;

/**
 * https://leetcode.com/problems/reverse-string-ii/
 */
public class ReverseStringII {

    public String reverseStr(String s, int k) {
        if (s == null || s.length() == 0) {
            return s;
        }
        char[] a = s.toCharArray();
        for (int index = 0; index < a.length; index += 2 * k) {
            int start = index, end = Math.min(index + k - 1, a.length - 1);
            while (start < end) {
                char tmp = a[start];
                a[start++] = a[end];
                a[end--] = tmp;
            }
        }
        return String.valueOf(a);
    }
}
