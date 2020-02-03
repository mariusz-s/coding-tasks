package pl.softwarie.leetcode.algorithms.medium;

import java.util.Random;

/**
 * https://leetcode.com/problems/shuffle-an-array/
 */
public class ShuffleArray {

    private final int[] nums;
    private final Random rand = new Random();

    public ShuffleArray(int[] nums) {
        this.nums = nums;
    }

    /**
     * Resets the array to its original configuration and return it.
     */
    public int[] reset() {
        return nums;
    }

    /**
     * Returns a random shuffling of the array.
     */
    public int[] shuffle() {
        int[] result = new int[nums.length];
        System.arraycopy(nums, 0, result, 0, nums.length);
        for (int i = 0; i < nums.length; i++) {
            int random = rand.nextInt(nums.length);
            int tmp = result[i];
            result[i] = result[random];
            result[random] = tmp;
        }
        return result;
    }
}
