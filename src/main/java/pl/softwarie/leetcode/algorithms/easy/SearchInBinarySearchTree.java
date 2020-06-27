package pl.softwarie.leetcode.algorithms.easy;

import pl.softwarie.leetcode.algorithms.common.TreeNode;

/**
 * https://leetcode.com/problems/search-in-a-binary-search-tree/
 */
public class SearchInBinarySearchTree {

    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return null;
        }
        if (root.val == val) {
            return root;
        }
        if (root.val < val) {
            return searchBST(root.right, val);
        }
        return searchBST(root.left, val);
    }
}
