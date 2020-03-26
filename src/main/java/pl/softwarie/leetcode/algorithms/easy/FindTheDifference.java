package pl.softwarie.leetcode.algorithms.easy;

/**
 * https://leetcode.com/problems/find-the-difference/
 */
public class FindTheDifference {

    public char findTheDifference(String s, String t) {
        int[] counters = new int[26];
        for (char c : t.toCharArray()) {
            counters[c - 'a']++;
        }
        for (char c : s.toCharArray()) {
            counters[c - 'a']--;
        }
        for (int i = 0; i < counters.length; i++) {
            if (counters[i] > 0) {
                return (char) (i + 'a');
            }
        }
        return 'Z';
    }
}
