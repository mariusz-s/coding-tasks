package pl.softwarie.leetcode.algorithms.easy;

import pl.softwarie.leetcode.algorithms.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/binary-tree-level-order-traversal-ii/
 */
public class BinaryTreeLevelOrderTraversalII {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> results = new ArrayList<>();
        if (root == null) {
            return results;
        }
        int height = height(root);
        for (int i = 0; i < height; i++) {
            results.add(new ArrayList<>());
        }
        levelOrderTraversal(root, height - 1, results);
        return results;
    }

    private void levelOrderTraversal(TreeNode root, int depth, List<List<Integer>> results) {
        if (root == null) {
            return;
        }
        List<Integer> level = results.get(depth);
        level.add(root.val);
        levelOrderTraversal(root.left, depth - 1, results);
        levelOrderTraversal(root.right, depth - 1, results);
    }

    private int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }
}
