package pl.softwarie.leetcode.algorithms.easy;

import pl.softwarie.leetcode.algorithms.common.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * https://leetcode.com/problems/binary-tree-paths/
 */
public class BinaryTreePaths {

    private static final String PATH_SEPARATOR = "->";

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        getAllBinaryTreePath(root, paths, new ArrayList<>());
        return paths;
    }

    private void getAllBinaryTreePath(TreeNode node, List<String> result, List<Integer> path) {
        if (node == null) {
            return;
        }
        path.add(node.val);
        if (node.left == null && node.right == null) {
            String tmp = path.stream()
                    .map(String::valueOf)
                    .collect(Collectors.joining(PATH_SEPARATOR));
            result.add(tmp);
        } else {
            getAllBinaryTreePath(node.left, result, path);
            getAllBinaryTreePath(node.right, result, path);
        }
        path.remove(path.size() - 1);
    }
}
