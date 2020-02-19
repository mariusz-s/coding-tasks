package pl.softwarie.leetcode.algorithms.easy;

/**
 * https://leetcode.com/problems/reverse-linked-list/
 */
public class ReverseLinkedList {

    public ListNode reverseList(ListNode node) {
        ListNode prev = null;
        ListNode current = node;
        ListNode next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
