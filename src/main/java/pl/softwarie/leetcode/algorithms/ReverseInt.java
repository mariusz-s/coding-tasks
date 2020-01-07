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
        byte[] digits = new byte[(int) Math.log10(abs) + 1];
        byte sign = x > 0 ? (byte) 1 : (byte) -1;
        byte i = 0;
        x = abs;
        while (x != 0) {
            digits[i] = (byte) (x % 10);
            i++;
            x = x / 10;
        }
        x = 0;
        try {
            for (byte digit : digits) {
                x = Math.addExact(x, Math.multiplyExact(digit, (int) Math.pow(10, --i)));
            }
        } catch (ArithmeticException exc) {
            return 0;
        }
        return x * sign;
    }
}
