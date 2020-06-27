package pl.softwarie.leetcode.algorithms.medium;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/contiguous-array/
 */
public class ContiguousArray {

    public static int findMaxLength(int[] nums) {
        int[] arr = new int[2 * nums.length + 1];
        Arrays.fill(arr, -2);
        arr[nums.length] = -1;
        int maxLength = 0, count = 0;
        for (int i = 0; i < nums.length; i++) {
            count = count + (nums[i] == 0 ? -1 : 1);
            if (arr[count + nums.length] >= -1) {
                maxLength = Math.max(maxLength, i - arr[count + nums.length]);
            } else {
                arr[count + nums.length] = i;
            }

        }
        return maxLength;
    }
}
