package pl.softwarie.leetcode.algorithms.easy;

/**
 * https://leetcode.com/problems/license-key-formatting/
 */
public class LicenseKeyFormatting {

    private static final char DASH = '-';

    public String licenseKeyFormatting(String S, int K) {
        StringBuilder result = new StringBuilder();
        int count = 0;
        for (int i = S.length() - 1; i >= 0; i--) {
            char c = S.charAt(i);
            if (c == DASH) {
                continue;
            } else if (count == K) {
                result.append('-');
                count = 0;
            }
            result.append(Character.toUpperCase(c));
            count++;
        }
        return result.reverse().toString();
    }
}
