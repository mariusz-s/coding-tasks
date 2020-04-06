package pl.softwarie.leetcode.algorithms.medium;

import java.util.*;

/**
 * https://leetcode.com/problems/group-anagrams/
 */
public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] input) {
        if (input == null || input.length == 0) {
            return new ArrayList<>();
        }
        Map<String, List<String>> ans = new HashMap<>();
        List<List<String>> results = new ArrayList<>();
        for (String s : input) {
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String key = String.valueOf(ca);
            List<String> tmp = ans.getOrDefault(key, new ArrayList<>());
            tmp.add(s);
            ans.put(key, tmp);
        }
        for (Map.Entry<String, List<String>> entry : ans.entrySet()) {
            results.add(entry.getValue());
        }
        return results;
    }
}
