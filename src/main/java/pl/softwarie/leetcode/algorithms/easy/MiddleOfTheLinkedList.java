package pl.softwarie.leetcode.algorithms.easy;

import pl.softwarie.leetcode.algorithms.common.ListNode;

/**
 * https://leetcode.com/problems/middle-of-the-linked-list/
 */
public class MiddleOfTheLinkedList {

    public ListNode middleNode(ListNode head) {
        int count = 0;
        ListNode result = head;
        while (head != null) {
            head = head.next;
            count++;
        }
        for (int i = 0; i < count / 2; i++) {
            result = result.next;
        }
        return result;
    }
}
