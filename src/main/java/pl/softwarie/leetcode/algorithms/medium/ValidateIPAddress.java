package pl.softwarie.leetcode.algorithms.medium;

import java.util.regex.Pattern;

/**
 * https://leetcode.com/problems/validate-ip-address/
 */
public class ValidateIPAddress {

    private static final String IP_4 = "([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])";
    private static final Pattern PATTERN_IP_4 = Pattern.compile("^(" + IP_4 + "\\.){3}" + IP_4 + "$");

    private static final String IP_6 = "([0-9a-fA-F]{1,4})";
    private static final Pattern PATTERN_IP_6 = Pattern.compile("^(" + IP_6 + ":){7}" + IP_6 + "$");

    public String validIPAddress(String IP) {
        if (PATTERN_IP_4.matcher(IP).matches()) {
            return "IPv4";
        }
        return PATTERN_IP_6.matcher(IP).matches() ? "IPv6" : "Neither";
    }
}
