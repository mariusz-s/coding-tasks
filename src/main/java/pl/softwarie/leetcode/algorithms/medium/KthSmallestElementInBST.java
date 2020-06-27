package pl.softwarie.leetcode.algorithms.medium;

import pl.softwarie.leetcode.algorithms.common.TreeNode;

/**
 * https://leetcode.com/problems/kth-smallest-element-in-a-bst
 */
public class KthSmallestElementInBST {

    public int kthSmallest(TreeNode root, int k) {
        return inorder(root, new Pair(0, k));
    }

    public int inorder(TreeNode root, Pair pair) {
        if (root.left != null) {
            int val = inorder(root.left, pair);
            if (pair.i == pair.k) {
                return val;
            }
        }

        ++pair.i;
        if (pair.i == pair.k) {
            return root.val;
        }

        if (root.right != null) {
            int val = this.inorder(root.right, pair);
            if (pair.i == pair.k) {
                return val;
            }
        }

        return root.val;
    }

    private static class Pair {
        int i;
        int k;

        public Pair(int i, int k) {
            this.i = i;
            this.k = k;
        }
    }
}
