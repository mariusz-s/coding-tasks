package pl.softwarie.leetcode.algorithms.easy;

import pl.softwarie.leetcode.algorithms.common.TreeNode;

/**
 * https://leetcode.com/problems/balanced-binary-tree/
 */
public class BalancedBinaryTree {

    public boolean isBalanced(TreeNode root) {
        return height(root) != -1;
    }

    private int height(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        boolean isNotBalanced = leftHeight == -1 || rightHeight == -1 || Math.abs(leftHeight - rightHeight) > 1;
        if (isNotBalanced) {
            return -1;
        }
        return 1 + Math.max(leftHeight, rightHeight);
    }
}
