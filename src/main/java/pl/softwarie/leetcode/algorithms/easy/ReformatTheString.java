package pl.softwarie.leetcode.algorithms.easy;

/**
 * https://leetcode.com/problems/reformat-the-string/
 */
public class ReformatTheString {

    public String reformat(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }
        char[] result = new char[s.length()];
        int letters = 0;
        int numbers = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                numbers++;
            } else {
                letters++;
            }
        }
        if (Math.abs(numbers - letters) > 1) {
            return "";
        }
        int n = (letters > numbers) ? 1 : 0;
        int l = (letters > numbers) ? 0 : 1;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                result[n] = s.charAt(i);
                n += 2;
            } else {
                result[l] = s.charAt(i);
                l += 2;
            }
        }
        return new String(result);
    }
}
