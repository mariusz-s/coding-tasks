package pl.softwarie.leetcode.algorithms.medium;

import pl.softwarie.leetcode.algorithms.common.TreeNode;

/**
 * https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal/
 */
public class ConstructBinarySearchTreeFromPreorderTraversal {

    public TreeNode bstFromPreorder(int[] input) {
        if (input == null || input.length == 0) {
            return null;
        }
        TreeNode root = null;
        for (int value : input) {
            root = insert(root, value);
        }
        return root;
    }

    private TreeNode insert(TreeNode root, int number) {
        if (root == null) {
            return new TreeNode(number);
        }
        if (number < root.val) {
            root.left = insert(root.left, number);
        }
        if (number > root.val) {
            root.right = insert(root.right, number);
        }
        return root;
    }
}
