package pl.softwarie.leetcode.algorithms.easy;

/**
 * https://leetcode.com/problems/valid-anagram/
 */
public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        if (s == null || t == null || s.length() != t.length()) {
            return false;
        }
        int[] helper = new int[26];
        for (char c : s.toCharArray()) {
            helper[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            helper[c - 'a']--;
        }
        for (int i : helper) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }
}
