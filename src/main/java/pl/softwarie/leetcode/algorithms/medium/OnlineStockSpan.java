package pl.softwarie.leetcode.algorithms.medium;

import java.util.Stack;

/**
 * https://leetcode.com/problems/online-stock-span/
 */
public class OnlineStockSpan {

    private final Stack<Pair> stack = new Stack<>();

    public int next(int price) {
        int result = 1;
        while (!stack.isEmpty() && stack.peek().price <= price) {
            result += stack.pop().spanNum;
        }
        stack.push(new Pair(price, result));
        return result;
    }

    public static class Pair {

        public final int price, spanNum;

        public Pair(int price, int spanNum) {
            this.price = price;
            this.spanNum = spanNum;
        }
    }
}
