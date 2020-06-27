package pl.softwarie.leetcode.algorithms.easy;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/two-city-scheduling
 */
public class TwoCityScheduling {

    public int twoCitySchedCost(int[][] costs) {
        if (costs == null || costs.length == 0) {
            return 0;
        }
        Arrays.sort(costs, (p1, p2) -> (p1[0] - p2[0]) - (p1[1] - p2[1]));
        int sum = 0;
        int N = costs.length / 2;
        for (int i = 0; i < N; i++) {
            sum += costs[i][0];
            sum += costs[N + i][1];
        }
        return sum;
    }
}
