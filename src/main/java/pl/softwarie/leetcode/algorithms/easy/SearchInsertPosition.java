package pl.softwarie.leetcode.algorithms.easy;

/**
 * https://leetcode.com/problems/search-insert-position/
 */
public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        if (null == nums || nums.length == 0) {
            return 0;
        }
        return binarySearch(nums, 0, nums.length - 1, target);
    }

    public int binarySearch(int[] nums, int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == x) {
                return mid;
            }
            if (nums[mid] > x) {
                return binarySearch(nums, l, mid - 1, x);
            }
            return binarySearch(nums, mid + 1, r, x);
        }
        return l;
    }
}
