package pl.softwarie.leetcode.algorithms.easy;

/**
 * https://leetcode.com/problems/flood-fill/
 */
public class FloodFill {

    public int[][] floodFill(int[][] image, int sr, int sc, int newColour) {
        if (image == null) {
            return null;
        }
        int originalColour = image[sr][sc];
        if (originalColour != newColour) {
            colour(image, sr, sc, newColour, originalColour);
        }
        return image;
    }

    private void colour(int[][] image, int i, int j, int newColour, int originalColour) {
        if (image[i][j] != originalColour) {
            return;
        }
        image[i][j] = newColour;
        if (i >= 1) {
            colour(image, i - 1, j, newColour, originalColour);
        }
        if (j >= 1) {
            colour(image, i, j - 1, newColour, originalColour);
        }
        if (i + 1 < image.length) {
            colour(image, i + 1, j, newColour, originalColour);
        }
        if (j + 1 < image[i].length) {
            colour(image, i, j + 1, newColour, originalColour);
        }
    }
}
