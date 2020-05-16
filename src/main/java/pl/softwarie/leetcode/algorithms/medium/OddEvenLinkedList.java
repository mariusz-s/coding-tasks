package pl.softwarie.leetcode.algorithms.medium;

import pl.softwarie.leetcode.algorithms.common.ListNode;

/**
 * https://leetcode.com/problems/odd-even-linked-list/
 */
public class OddEvenLinkedList {

    public ListNode oddEvenList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode odd = head, even = head.next, evenHead = even;
        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
}
