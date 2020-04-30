package pl.softwarie.leetcode.algorithms.easy;

import pl.softwarie.leetcode.algorithms.common.TreeNode;

/**
 * https://leetcode.com/explore/featured/card/30-day-leetcoding-challenge/532/week-5/3315/
 */
public class ValidSequenceFromRootToLeavesPath {

    public boolean isValidSequence(TreeNode root, int[] arr) {
        return visit(root, 0, arr);
    }

    private boolean visit(TreeNode node, int position, int[] arr) {
        if (node == null || position >= arr.length || node.val != arr[position]) {
            return false;
        }
        if (arr.length - 1 == position && node.left == null && node.right == null) {
            return true;
        }
        position += 1;
        return visit(node.left, position, arr) || visit(node.right, position, arr);
    }
}
