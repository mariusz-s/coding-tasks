package pl.softwarie.leetcode.algorithms;

/**
 * https://leetcode.com/problems/implement-strstr/
 */
public class ImplementStrStr {

    public static int strStr(String haystack, String needle) {

        if (null == needle || needle.isEmpty()) {
            return 0;
        }
        if (null == haystack || haystack.isEmpty() || needle.length() > haystack.length()) {
            return -1;
        }

        int i = 0;
        int j = 0;
        int start = -1;
        while (i < haystack.length()) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                if (j == 0) {
                    start = i;
                }
                j++;
                if (j >= needle.length()) {
                    return start;
                }
            } else {
                j = 0;
                if (-1 != start) {
                    i = start;
                    start = -1;
                }
            }
            i++;
        }

        return -1;
    }
}
