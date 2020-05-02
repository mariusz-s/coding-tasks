package pl.softwarie.leetcode.algorithms.easy;

/**
 * https://leetcode.com/problems/perfect-number/
 */
public class PerfectNumber {

    public boolean checkPerfectNumber(int num) {
        if (num <= 0) {
            return false;
        }
        int sum = 0;
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                if (i * i != num) {
                    sum += num / i;
                }
            }
        }
        return sum == (2 * num);
    }
}
