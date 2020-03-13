package pl.softwarie.leetcode.algorithms.easy;

/**
 * https://leetcode.com/problems/excel-sheet-column-title/
 */
public class ExcelSheetColumnTitle {

    public String convertToTitle(int n) {
        StringBuilder name = new StringBuilder();
        while (n > 0) {
            n--;
            int m = n % 26;
            name.insert(0, (char) ('A' + m));
            n = n / 26;
        }
        return name.toString();
    }
}
