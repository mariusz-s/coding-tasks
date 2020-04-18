package pl.softwarie.leetcode.algorithms.easy;

import pl.softwarie.leetcode.algorithms.common.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/path-sum-iii/
 */
public class PathSumIII {

    public int pathSum(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        return countPath(root, sum, 0, map);
    }

    private int countPath(TreeNode node, int sum, int currentSum, Map<Integer, Integer> mapping) {
        if (node == null) {
            return 0;
        }
        currentSum += node.val;
        int count = mapping.getOrDefault(currentSum - sum, 0);
        mapping.put(currentSum, mapping.getOrDefault(currentSum, 0) + 1);
        count += countPath(node.left, sum, currentSum, mapping) + countPath(node.right, sum, currentSum, mapping);
        mapping.put(currentSum, mapping.get(currentSum) - 1);
        return count;
    }
}
