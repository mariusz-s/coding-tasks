package pl.softwarie.leetcode.algorithms.hard;

import pl.softwarie.leetcode.algorithms.common.TreeNode;

/**
 * https://leetcode.com/problems/binary-tree-maximum-path-sum/
 */
public class BinaryTreeMaximumPathSum {

    public int maxPathSum(TreeNode root) {
        Max max = new Max();
        max.value = Integer.MIN_VALUE;
        calculateSum(root, max);
        return max.value;
    }

    public int calculateSum(TreeNode root, Max max) {
        if (root == null) {
            return 0;
        }
        int left = calculateSum(root.left, max);
        int right = calculateSum(root.right, max);
        int current = Math.max(root.val, Math.max(root.val + left, root.val + right));
        max.value = Math.max(max.value, Math.max(current, left + root.val + right));
        return current;
    }

    private static class Max {
        int value;
    }
}
