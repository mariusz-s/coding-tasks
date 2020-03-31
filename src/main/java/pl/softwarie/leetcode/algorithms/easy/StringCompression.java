package pl.softwarie.leetcode.algorithms.easy;

/**
 * https://leetcode.com/problems/string-compression/
 */
public class StringCompression {

    public int compress(char[] chars) {
        int len = 0;
        for (int i = 0, j = 0; i < chars.length; i = j) {
            while (j < chars.length && chars[i] == chars[j]) {
                j++;
            }
            chars[len++] = chars[i];
            if ((j - i) <= 1) {
                continue;
            }
            for (char c : Integer.toString(j - i).toCharArray()) {
                chars[len++] = c;
            }
        }
        return len;
    }
}
