package pl.softwarie.leetcode.algorithms.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/number-of-boomerangs/
 */
public class NumberOfBoomerangs {

    public int numberOfBoomerangs(int[][] points) {
        int counter = 0;
        for (int i = 0; i < points.length; i++) {
            Map<Integer, Integer> cache = new HashMap<>();
            for (int j = 0; j < points.length; j++) {
                if (i == j) {
                    continue;
                }
                int deltaX = points[j][0] - points[i][0];
                int deltaY = points[j][1] - points[i][1];
                int distance = deltaX * deltaX + deltaY * deltaY;
                int sameDistances = cache.getOrDefault(distance, 0);
                counter += 2 * sameDistances;
                cache.put(distance, sameDistances + 1);
            }
        }
        return counter;
    }
}
