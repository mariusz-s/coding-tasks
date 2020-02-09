package pl.softwarie.leetcode.algorithms.easy;

/**
 * https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
 */
public class SortedArrayToBST {

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        int high = nums.length - 1;
        int low = 0;
        return sortedArrayToBST(nums, low, high);
    }

    public TreeNode sortedArrayToBST(int[] nums, int low, int high) {
        if (low > high) {
            return null;
        }
        int mid = low + (high - low) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortedArrayToBST(nums, low, mid - 1);
        root.right = sortedArrayToBST(nums, mid + 1, high);
        return root;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
