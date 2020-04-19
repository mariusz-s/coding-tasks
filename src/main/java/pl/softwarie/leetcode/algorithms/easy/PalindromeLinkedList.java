package pl.softwarie.leetcode.algorithms.easy;

import pl.softwarie.leetcode.algorithms.common.ListNode;

/**
 * https://leetcode.com/problems/palindrome-linked-list/
 */
public class PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        int nodesCount = 0;
        ListNode current = head;
        while (current != null) {
            nodesCount++;
            current = current.next;
        }
        int middleIndex = 1;
        current = head;
        while (middleIndex < nodesCount / 2) {
            current = current.next;
            middleIndex++;
        }
        ListNode middleNode = reverse(current.next);
        current = head;
        while (middleNode != null) {
            if (current.val != middleNode.val) {
                return false;
            }
            current = current.next;
            middleNode = middleNode.next;
        }
        return true;
    }

    private ListNode reverse(ListNode head) {
        ListNode current = head;
        ListNode previous = null;
        ListNode next;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }
}
