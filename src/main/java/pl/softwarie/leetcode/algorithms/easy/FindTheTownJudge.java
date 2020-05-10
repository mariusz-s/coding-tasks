package pl.softwarie.leetcode.algorithms.easy;

/**
 * https://leetcode.com/problems/find-the-town-judge/
 */
public class FindTheTownJudge {

    private static final int NOT_FOUND = -1;

    public int findJudge(int N, int[][] trust) {
        if (trust == null) {
            return NOT_FOUND;
        }
        int[] in = new int[N + 1];
        int[] out = new int[N + 1];
        for (int[] pair : trust) {
            out[pair[0]]++;
            in[pair[1]]++;
        }
        for (int i = 1; i <= N; i++) {
            if (in[i] == N - 1 && out[i] == 0) {
                return i;
            }
        }
        return NOT_FOUND;
    }
}
