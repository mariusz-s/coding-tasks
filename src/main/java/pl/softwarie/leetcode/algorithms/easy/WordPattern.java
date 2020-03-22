package pl.softwarie.leetcode.algorithms.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * https://leetcode.com/problems/word-pattern/
 */
public class WordPattern {

    public boolean wordPattern(String pattern, String str) {
        char[] pArray = pattern.toCharArray();
        String[] sArray = str.split(" ");
        if (pArray.length != sArray.length) {
            return false;
        }
        Map<Character, Integer> cmap = new HashMap<>();
        Map<String, Integer> smap = new HashMap<>();
        for (int i = 0; i < pArray.length; i++) {
            if (!Objects.equals(cmap.put(pArray[i], i), smap.put(sArray[i], i))) {
                return false;
            }
        }
        return true;
    }
}
