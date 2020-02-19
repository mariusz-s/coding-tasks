package pl.softwarie.leetcode.algorithms.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/happy-number/
 */
public class HappyNumber {

    public boolean isHappy(int n) {
        Map<Integer, Integer> sums = new HashMap<>();
        int sum = getSum(n);
        while (!sums.containsKey(sum)) {
            if (sum == 1) {
                return true;
            }
            sums.put(sum, 0);
            sum = getSum(sum);
        }
        return false;
    }

    private int getSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += Math.pow(n % 10, 2);
            n = n / 10;
        }
        return sum;
    }
}
