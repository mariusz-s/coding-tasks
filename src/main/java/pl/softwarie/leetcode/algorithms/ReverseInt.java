package pl.softwarie.leetcode.algorithms;

/**
 * https://leetcode.com/problems/reverse-integer/
 */
public class ReverseInt {

    public static int reverse(int x) {
        if (0 == x || x == Integer.MAX_VALUE || x == Integer.MIN_VALUE) {
            return 0;
        }
        int abs = Math.abs(x);
        byte digits = (byte) (Math.log10(abs) + 1);
        byte sign = x > 0 ? (byte) 1 : (byte) -1;
        x = 0;
        try {
            while (abs != 0) {
                x = Math.addExact(x, Math.multiplyExact(abs % 10, (int) Math.pow(10, --digits)));
                abs = abs / 10;
            }
        } catch (ArithmeticException exc) {
            return 0;
        }
        return x * sign;
    }
}
