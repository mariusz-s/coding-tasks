package pl.softwarie.leetcode.algorithms;

/**
 * https://leetcode.com/problems/remove-element/
 */
public class RemoveElement {

    public int removeElement(int[] nums, int val) {

        if (null == nums || 0 == nums.length) {
            return 0;
        }

        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            if (nums[start] == val) {
                nums[start] = nums[end];
                end--;
            } else {
                start++;
            }
        }

        return start;
    }
}
