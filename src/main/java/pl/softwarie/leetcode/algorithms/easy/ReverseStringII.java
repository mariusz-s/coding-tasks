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
        for (int start = 0; start < a.length; start += 2 * k) {
            int i = start, j = Math.min(start + k - 1, a.length - 1);
            while (i < j) {
                char tmp = a[i];
                a[i++] = a[j];
                a[j--] = tmp;
            }
        }
        return String.valueOf(a);
    }
}
