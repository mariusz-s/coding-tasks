package pl.softwarie.leetcode.algorithms.easy;

/**
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/
 */
public class MaxDepthOfBinaryTree {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(height(root.left), height(root.right));
    }

    private int height(TreeNode node) {
        if (node == null) {
            return 1;
        }
        return 1 + Math.max(height(node.left), height(node.right));
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
