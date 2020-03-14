package pl.softwarie.leetcode.algorithms.easy;

/**
 * https://leetcode.com/problems/excel-sheet-column-number/
 */
public class ExcelSheetColumnNumber {

    public int titleToNumber(String s) {
        int count = 0;
        int p = 1;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            count += p * (c - 'A' + 1);
            p *= 26;
        }
        return count;
    }
}
