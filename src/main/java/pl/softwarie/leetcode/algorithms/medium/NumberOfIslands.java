package pl.softwarie.leetcode.algorithms.medium;

/**
 * https://leetcode.com/problems/number-of-islands/
 */
public class NumberOfIslands {

    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        int right = grid.length;
        int left = grid[0].length;
        int count = 0;
        for (int i = 0; i < right; i++) {
            for (int j = 0; j < left; j++) {
                if (grid[i][j] == '1') {
                    dfs(grid, i, j, right, left);
                    count++;
                }

            }
        }
        return count;
    }

    private void dfs(char[][] grid, int x, int y, int right, int left) {
        if (x < 0 || x >= right || y < 0 || y >= left || grid[x][y] != '1') {
            return;
        }
        grid[x][y] = '2';
        dfs(grid, x + 1, y, right, left);
        dfs(grid, x - 1, y, right, left);
        dfs(grid, x, y + 1, right, left);
        dfs(grid, x, y - 1, right, left);
    }
}
