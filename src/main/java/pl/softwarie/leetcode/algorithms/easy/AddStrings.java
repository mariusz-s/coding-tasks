package pl.softwarie.leetcode.algorithms.easy;

/**
 * https://leetcode.com/problems/add-strings/
 */
public class AddStrings {

    public String addStrings(String num1, String num2) {
        if (num1 == null && num2 == null) {
            return null;
        }
        if (num1 == null) {
            return num2;
        }
        if (num2 == null) {
            return num1;
        }
        StringBuilder sb = new StringBuilder();
        int i = num1.length();
        int j = num2.length();
        int carry = 0;
        while (i > 0 || j > 0) {
            char a = (i > 0) ? num1.charAt(i - 1) : '0';
            char b = (j > 0) ? num2.charAt(j - 1) : '0';
            int result = carry + (a - '0') + (b - '0');
            carry = result / 10;
            result = result % 10;
            sb.append(result);
            i--;
            j--;
        }
        if (carry > 0) {
            sb.append(1);
        }
        return sb.reverse().toString();
    }
}
