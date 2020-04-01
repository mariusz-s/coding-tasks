package pl.softwarie.leetcode.algorithms.easy;

/**
 * https://leetcode.com/problems/arranging-coins/
 */
public class ArrangingCoins {

    public int arrangeCoins(int n) {
        int value = (int) Math.sqrt((long) n * 8 + 1);
        return (value - 1) / 2;
    }
}
