package pl.softwarie.leetcode.algorithms.easy;

/**
 * https://leetcode.com/problems/can-place-flowers/
 */
public class CanPlaceFlowers {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (flowerbed == null || flowerbed.length == 0) {
            return false;
        }
        for (int i = 0; i < flowerbed.length; i++) {
            if ((i > 0 && flowerbed[i - 1] == 1)
                    || (i < flowerbed.length - 1 && flowerbed[i + 1] == 1)
                    || flowerbed[i] == 1) {
                continue;
            }
            flowerbed[i] = 1;
            n--;
        }
        return n <= 0;
    }
}
