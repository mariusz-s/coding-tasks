package pl.softwarie.leetcode.algorithms.medium;

import java.util.Stack;

/**
 * https://leetcode.com/problems/remove-k-digits/
 */
public class RemoveKDigits {

    public String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < num.length(); i++) {
            while (k > 0 && !stack.isEmpty() && stack.peek() > num.charAt(i)) {
                stack.pop();
                k--;
            }
            stack.push(num.charAt(i));
        }
        while (k > 0) {
            stack.pop();
            k--;
        }
        StringBuilder build = new StringBuilder();
        for (char c : stack) {
            if (build.length() > 0 || c != '0') {
                build.append(c);
            }
        }
        return build.length() > 0 ? build.toString() : "0";
    }
}
