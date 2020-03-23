package pl.softwarie.leetcode.algorithms.easy;

/**
 * https://leetcode.com/problems/guess-number-higher-or-lower/
 */
public class GuessNumber {

    public int guessNumber(int n) {
        int start = 1;
        int end = n;
        while (start <= end) {
            int k = start + (end - start) / 2;
            int result = guess(k);
            if (result == 0) {
                return k;
            } else if (result == 1) {
                start = k + 1;
            } else {
                end = k - 1;
            }
        }
        return -1;
    }

    // method provided by LC
    private int guess(int n) {
        return 0;
    }
}
