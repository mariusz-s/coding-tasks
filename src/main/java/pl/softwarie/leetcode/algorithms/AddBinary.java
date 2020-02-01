package pl.softwarie.leetcode.algorithms;

/**
 * https://leetcode.com/problems/add-binary/
 */
public class AddBinary {

    public String addBinary(String a, String b) {

        if (a == null || a.length() == 0) {
            return b;
        }
        if (b == null || b.length() == 0) {
            return a;
        }

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        StringBuilder result = new StringBuilder();
        while (i >= 0 || j >= 0) {
            if (i >= 0) {
                carry += Character.getNumericValue(a.charAt(i));
            }
            if (j >= 0) {
                carry += Character.getNumericValue(b.charAt(j));
            }
            result.append(carry % 2);
            carry = carry / 2;
            i--;
            j--;
        }
        if (carry > 0) {
            result.append(carry);
        }
        return result.reverse().toString();
    }
}
