package pl.softwarie.leetcode.algorithms.easy;

/**
 * https://leetcode.com/problems/fibonacci-number/
 */
public class FibonacciNumber {

    public int fib(int n) {
        if (n <= 1) {
            return n;
        }
        if (n == 2) {
            return 1;
        }
        int current = 0;
        int previousOne = 1;
        int previousTwo = 1;
        for (int i = 3; i <= n; i++) {
            current = previousOne + previousTwo;
            previousTwo = previousOne;
            previousOne = current;
        }
        return current;
    }
}
