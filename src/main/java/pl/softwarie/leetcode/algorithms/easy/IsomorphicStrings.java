package pl.softwarie.leetcode.algorithms.easy;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {

        if (s == null || t == null || s.length() != t.length()) {
            return false;
        }
        Map<Character, Character> mapping = new HashMap<>();
        Map<Character, Character> mappingInverse = new HashMap<>();
        int index = 0;
        while (index < s.length()) {
            Character a = s.charAt(index);
            Character b = t.charAt(index);
            Character c = mapping.get(a);
            if (c != null) {
                if (c != b) {
                    return false;
                }
            } else if (mappingInverse.containsKey(b)) {
                return false;
            }
            mapping.put(a, b);
            mappingInverse.put(b, a);
            index++;
        }
        return true;
    }
}
