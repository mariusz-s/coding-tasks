package pl.softwarie.leetcode.algorithms.easy;

/**
 * https://leetcode.com/problems/is-subsequence/
 */
public class IsSubsequence {

    public boolean isSubsequence(String s, String t) {
        if (t.length() < s.length()) {
            return false;
        } else if (s.isEmpty()) {
            return true;
        }
        int sIndex = 0;
        for (int tIndex = 0; tIndex < t.length(); tIndex++) {
            if (s.charAt(sIndex) == t.charAt(tIndex)) {
                sIndex++;
                if (sIndex == s.length()) {
                    return true;
                }
            }
        }
        return false;
    }
}
