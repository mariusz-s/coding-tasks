package pl.softwarie.leetcode.algorithms.easy;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/assign-cookies/
 */
public class AssignCookies {

    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int children = 0;
        int i = 0;
        int j = 0;
        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) {
                children++;
                i++;
            }
            j++;
        }
        return children;
    }
}
