package pl.softwarie.leetcode.algorithms.easy;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/heaters/
 */
public class Heaters {

    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int i = 0, res = 0;
        for (int house : houses) {
            while (i < heaters.length - 1 && house - heaters[i] >= heaters[i + 1] - house) {
                i++;
            }
            res = Math.max(res, Math.abs(heaters[i] - house));
        }
        return res;
    }
}
