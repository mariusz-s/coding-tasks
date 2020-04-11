package pl.softwarie.leetcode.algorithms.easy;

import pl.softwarie.leetcode.algorithms.common.TreeNode;

/**
 * https://leetcode.com/problems/diameter-of-binary-tree/
 */
public class DiameterOfBinaryTree {

    public int diameterOfBinaryTree(TreeNode root) {
        int[] result = new int[1];
        dfs(root, result);
        return result[0];
    }

    private int dfs(TreeNode node, int[] path) {
        if (node == null) {
            return 0;
        }
        int left = dfs(node.left, path);
        int right = dfs(node.right, path);
        path[0] = Math.max(path[0], left + right);
        return Math.max(left, right) + 1;
    }
}
