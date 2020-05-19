package pl.softwarie.leetcode.algorithms.medium;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/permutation-in-string/
 */
public class PermutationInString {

    public boolean checkInclusion(String s1, String s2) {
        if (s1 == null || s2 == null || s1.length() > s2.length()) {
            return false;
        }
        int[] s1map = new int[26];
        int[] s2map = new int[26];
        int s1Length = s1.length();
        for (int i = 0; i < s1Length; i++) {
            s1map[s1.charAt(i) - 'a']++;
            s2map[s2.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s2.length() - s1Length; i++) {
            if (Arrays.equals(s1map, s2map)) {
                return true;
            }
            s2map[s2.charAt(i + s1Length) - 'a']++;
            s2map[s2.charAt(i) - 'a']--;
        }
        return Arrays.equals(s1map, s2map);
    }
}
