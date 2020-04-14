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
        if (count > 0) {
            s = s.substring(count) + s.substring(0, count);
        } else if (count < 0) {
            count = count * -1;
            s = s.substring(s.length() - count) + s.substring(0, s.length() - count);
        }
        return s;
    }
}