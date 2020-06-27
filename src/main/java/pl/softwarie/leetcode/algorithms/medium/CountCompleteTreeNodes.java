package pl.softwarie.leetcode.algorithms.medium;

import pl.softwarie.leetcode.algorithms.common.TreeNode;

/**
 * https://leetcode.com/problems/count-complete-tree-nodes/
 */
public class CountCompleteTreeNodes {

    public int countNodes(TreeNode root) {
        int h = height(root);
        if (h < 0) {
            return 0;
        }
        int rightHeight = height(root.right);
        if (rightHeight == h - 1) {
            return (1 << h) + countNodes(root.right);
        }
        return (1 << (h - 1)) + countNodes(root.left);
    }

    private int height(TreeNode root) {
        return root == null ? -1 : 1 + height(root.left);
    }
}
