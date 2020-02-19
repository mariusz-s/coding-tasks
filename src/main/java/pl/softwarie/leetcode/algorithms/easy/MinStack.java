package pl.softwarie.leetcode.algorithms.easy;

import java.util.Stack;

/**
 * https://leetcode.com/problems/min-stack
 */
public class MinStack {

    private Stack<Node> stack = new Stack<>();

    public void push(int x) {
        if (stack.isEmpty()) {
            stack.push(new Node(x, x));
            return;
        }
        int min = Math.min(stack.peek().min, x);
        stack.push(new Node(x, min));
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek().val;
    }

    public int getMin() {
        return stack.peek().min;
    }

    private static class Node {
        int val;
        int min;

        public Node(int val, int min) {
            this.val = val;
            this.min = min;
        }
    }
}
