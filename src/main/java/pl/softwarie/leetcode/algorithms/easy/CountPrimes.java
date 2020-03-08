package pl.softwarie.leetcode.algorithms.easy;

/**
 * https://leetcode.com/problems/count-primes/
 */
public class CountPrimes {

    public int countPrimes(int n) {
        boolean[] sieve = new boolean[n];
        for (int i = 2; i < n; i++) {
            sieve[i] = true;
        }
        for (int i = 2; i * i < n; i++) {
            if (sieve[i]) {
                for (int j = i * i; j < n; j += i) {
                    sieve[j] = false;
                }
            }
        }
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (sieve[i]) {
                count++;
            }
        }
        return count;
    }
}
