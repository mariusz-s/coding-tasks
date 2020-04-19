package pl.softwarie.leetcode.algorithms.easy;

/**
 * https://leetcode.com/problems/number-of-lines-to-write-string/
 */
public class NumberOfLinesToWriteString {

    public int[] numberOfLines(int[] widths, String S) {
        int lines = 1, units = 0;
        for (int i = 0; i < S.length(); i++) {
            int width = widths[S.charAt(i) - 'a'];
            units += width;
            if (units > 100) {
                units = width;
                lines++;
            }
        }
        return new int[]{lines, units};
    }
}
