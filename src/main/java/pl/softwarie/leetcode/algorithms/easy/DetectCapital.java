package pl.softwarie.leetcode.algorithms.easy;

/**
 * https://leetcode.com/problems/detect-capital/
 */
public class DetectCapital {

    public boolean detectCapitalUse(String word) {
        if (word == null || word.isEmpty()) {
            return false;
        }
        int capitals = 0;
        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                capitals++;
            }
        }
        return word.length() == capitals || capitals == 0 || (capitals == 1 && Character.isUpperCase(word.charAt(0)));
    }
}
