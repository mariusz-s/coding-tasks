package pl.softwarie.leetcode.algorithms.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/sort-characters-by-frequency/
 */
public class SortCharactersByFrequency {

    public String frequencySort(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }
        Map<Character, Integer> counters = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            counters.put(c, counters.getOrDefault(c, 0) + 1);
        }
        StringBuilder sb = new StringBuilder();
        counters.entrySet().stream()
                .sorted((f1, f2) -> Integer.compare(f2.getValue(), f1.getValue()))
                .forEach(e -> {
                    for (int i = 0; i < e.getValue(); i++) {
                        sb.append(e.getKey());
                    }
                });
        return sb.toString();
    }
}
