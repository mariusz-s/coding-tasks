package pl.softwarie.leetcode.algorithms.medium;

/**
 * https://leetcode.com/problems/valid-parenthesis-string/
 */
public class ValidParenthesisString {

    public boolean checkValidString(String s) {
        int low = 0;
        int high = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                low++;
                high++;
            } else if (c == ')') {
                low--;
                high--;
            } else {
                low--;
                high++;
            }
            if (high < 0) {
                return false;
            }
            low = Math.max(low, 0);
        }
        return low == 0;
    }
}
