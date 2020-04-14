package pl.softwarie.leetcode.algorithms.easy;

/**
 * https://leetcode.com/explore/other/card/30-day-leetcoding-challenge/529/week-2/3299/
 */
public class PerformStringShifts {

    public String stringShift(String s, int[][] shift) {
        int count = 0;
        for (int[] tmp : shift) {
            if (tmp[0] == 0) {
                count += tmp[1];
            } else {
                count -= tmp[1];
            }
        }
        count = count % s.length();
        while (count > 0) {
            s = s.substring(1) + s.charAt(0);
            count--;
        }
        while (count < 0) {
            s = s.charAt(s.length() - 1) + s.substring(0, s.length() - 1);
            count++;
        }
        return s;
    }
}
