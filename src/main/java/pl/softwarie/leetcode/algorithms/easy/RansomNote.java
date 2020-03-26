package pl.softwarie.leetcode.algorithms.easy;

/**
 * https://leetcode.com/problems/ransom-note/
 */
public class RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote == null || magazine == null || ransomNote.length() > magazine.length()) {
            return false;
        }
        int[] counters = new int[26];
        for (char c : magazine.toCharArray()) {
            counters[c - 'a']++;
        }
        for (char c : ransomNote.toCharArray()) {
            if (counters[c - 'a'] == 0) {
                return false;
            }
            counters[c - 'a']--;
        }
        return true;
    }
}
