package pl.softwarie.leetcode.algorithms.easy;

/**
 * https://leetcode.com/problems/path-sum/
 */
public class PathSum {

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        if (root.val == sum & root.left == null && root.right == null) {
            return true;
        }
        return hasPathSum(root.left, sum, root.val)
                || hasPathSum(root.right, sum, root.val);
    }

    private boolean hasPathSum(TreeNode node, int sum, int current) {
        if (node == null) {
            return false;
        }
        if (node.val + current == sum & node.left == null && node.right == null) {
            return true;
        }
        return hasPathSum(node.left, sum, current + node.val)
                || hasPathSum(node.right, sum, current + node.val);
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
