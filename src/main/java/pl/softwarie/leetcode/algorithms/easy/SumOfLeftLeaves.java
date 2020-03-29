package pl.softwarie.leetcode.algorithms.easy;

import pl.softwarie.leetcode.algorithms.common.TreeNode;

/**
 * https://leetcode.com/problems/sum-of-left-leaves/
 */
public class SumOfLeftLeaves {

    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return sum(root.left, root.right);
    }

    private int sum(TreeNode left, TreeNode right) {
        int sum = 0;
        if (left != null && left.left == null && left.right == null) {
            sum += left.val;
        } else if (left != null) {
            sum += sum(left.left, left.right);
        }
        if (right != null) {
            sum += sum(right.left, right.right);
        }
        return sum;
    }
}
