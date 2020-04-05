package pl.softwarie.leetcode.algorithms.easy;

/**
 * https://leetcode.com/problems/island-perimeter/
 */
public class IslandPerimeter {

    public int islandPerimeter(int[][] grid) {
        int lands = 0;
        int edges = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 0) {
                    continue;
                }
                lands++;
                if (i > 0 && grid[i - 1][j] == 1) {
                    edges++;
                }
                if (j > 0 && grid[i][j - 1] == 1) {
                    edges++;
                }
            }
        }
        return lands * 4 - edges * 2;
    }
}
