package pl.softwarie.leetcode.algorithms.easy;

/**
 * https://leetcode.com/problems/length-of-last-word/
 */
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        if (null == s || s.isEmpty()) {
            return 0;
        }
        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            boolean isWhitespace = Character.isWhitespace(s.charAt(i));
            if (length > 0 && isWhitespace) {
                return length;
            }
            if (!isWhitespace) {
                length++;
            }
        }
        return length;
    }
}
