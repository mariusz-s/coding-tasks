package pl.softwarie.leetcode.algorithms.easy;

/**
 * https://leetcode.com/problems/base-7/
 */
public class Base7 {

    private final static int BASE = 7;

    public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        int abs = Math.abs(num);
        while (abs > 0) {
            sb.append(abs % BASE);
            abs /= BASE;
        }
        if (num < 0) {
            sb.append("-");
        }
        return sb.reverse().toString();
    }
}
