package pl.softwarie.leetcode.algorithms.easy;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MinDepthOfBinaryTreeTest {

    @Test
    public void minDepth() {
        // given
        MinDepthOfBinaryTree.TreeNode root = new MinDepthOfBinaryTree.TreeNode(1);
        root.left = new MinDepthOfBinaryTree.TreeNode(2);

        // when
        int depth = new MinDepthOfBinaryTree().minDepth(root);

        // then
        assertThat(depth).isEqualTo(2);
    }
}