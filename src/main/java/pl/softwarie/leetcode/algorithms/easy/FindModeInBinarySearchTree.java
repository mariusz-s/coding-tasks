package pl.softwarie.leetcode.algorithms.easy;

import pl.softwarie.leetcode.algorithms.common.TreeNode;

/**
 * https://leetcode.com/problems/find-mode-in-binary-search-tree/
 */
public class FindModeInBinarySearchTree {

    public int[] findMode(TreeNode root) {
        Parameters parameters = new Parameters();
        inOrder(root, parameters);
        parameters.mode = new int[parameters.modeCount];
        parameters.currentCount = 0;
        parameters.modeCount = 0;
        inOrder(root, parameters);
        return parameters.mode;
    }

    private void inOrder(TreeNode node, Parameters parameters) {
        if (node == null) return;
        inOrder(node.left, parameters);
        if (parameters.currentValue != node.val) {
            parameters.currentValue = node.val;
            parameters.currentCount = 0;
        }
        parameters.currentCount++;
        if (parameters.currentCount > parameters.max) {
            parameters.max = parameters.currentCount;
            parameters.modeCount = 1;
        } else if (parameters.currentCount == parameters.max) {
            if (parameters.mode != null) {
                parameters.mode[parameters.modeCount] = parameters.currentValue;
            }
            parameters.modeCount++;
        }
        inOrder(node.right, parameters);
    }

    private static class Parameters {
        int currentValue = 0;
        int currentCount = 0;
        int[] mode;
        int max = 0;
        int modeCount = 0;
    }
}
