package pl.softwarie.leetcode.algorithms.easy;

/**
 * https://leetcode.com/problems/add-digits/
 */
public class UglyNumber {

    public boolean isUgly(int num) {
        num = maxDivide(num, 2);
        num = maxDivide(num, 3);
        num = maxDivide(num, 5);
        return num == 1;
    }

    private int maxDivide(int n, int p) {
        while (n % p == 0 && n != 0) {
            n = n / p;
        }
        return n;
    }
}
