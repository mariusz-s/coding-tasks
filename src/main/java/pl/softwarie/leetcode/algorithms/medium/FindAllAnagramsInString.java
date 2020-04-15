package pl.softwarie.leetcode.algorithms.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/find-all-anagrams-in-a-string/
 */
public class FindAllAnagramsInString {

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s == null || p == null || s.isEmpty() || p.isEmpty() || s.length() < p.length()) {
            return result;
        }
        int pLength = p.length();
        int[] pChars = new int[26];
        int[] tmpChars = new int[26];
        for (int i = 0; i < pLength; i++) {
            pChars[p.charAt(i) - 'a'] += 1;
            tmpChars[s.charAt(i) - 'a'] += 1;
        }
        for (int i = pLength; i < s.length(); i++) {
            if (Arrays.equals(tmpChars, pChars)) {
                result.add(i - pLength);
            }
            tmpChars[s.charAt(i) - 'a'] += 1;
            tmpChars[s.charAt(i - pLength) - 'a'] -= 1;
        }
        if (Arrays.equals(tmpChars, pChars)) {
            result.add(s.length() - pLength);
        }
        return result;
    }
}
