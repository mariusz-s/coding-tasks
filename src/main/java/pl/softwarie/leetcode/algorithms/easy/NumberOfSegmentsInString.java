package pl.softwarie.leetcode.algorithms.easy;

/**
 * https://leetcode.com/problems/number-of-segments-in-a-string/
 */
public class NumberOfSegmentsInString {

    public int countSegments(String s) {
        int count = 0;
        boolean foundSegment = false;
        for (int i = 0; i < s.length(); i++) {
            boolean isWhitespace = Character.isWhitespace(s.charAt(i));
            if (foundSegment && isWhitespace) {
                count++;
            }
            foundSegment = !isWhitespace;
        }
        return foundSegment ? count + 1 : count;
    }
}
