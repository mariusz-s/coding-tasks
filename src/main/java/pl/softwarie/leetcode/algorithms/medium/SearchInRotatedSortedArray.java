package pl.softwarie.leetcode.algorithms.medium;

/**
 * https://leetcode.com/problems/search-in-rotated-sorted-array/
 */
public class SearchInRotatedSortedArray {

    private static final int INDEX_OF_NOT_FOUND = -1;

    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return INDEX_OF_NOT_FOUND;
        }
        return binarySearch(nums, 0, nums.length - 1, target);
    }

    private int binarySearch(int[] nums, int start, int end, int target) {
        if (start > end) {
            return INDEX_OF_NOT_FOUND;
        }
        int middle = (start + end) / 2;
        if (nums[middle] == target) {
            return middle;
        }
        if (nums[start] <= nums[middle]) {
            if (target >= nums[start] && target <= nums[middle]) {
                return binarySearch(nums, start, middle - 1, target);
            }
            return binarySearch(nums, middle + 1, end, target);
        }
        if (target >= nums[middle] && target <= nums[end]) {
            return binarySearch(nums, middle + 1, end, target);
        }
        return binarySearch(nums, start, middle - 1, target);
    }
}
