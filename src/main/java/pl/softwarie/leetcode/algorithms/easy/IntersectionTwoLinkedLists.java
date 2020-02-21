package pl.softwarie.leetcode.algorithms.easy;

import pl.softwarie.leetcode.algorithms.ListNode;

/**
 * https://leetcode.com/problems/intersection-of-two-linked-lists/
 */
public class IntersectionTwoLinkedLists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA, b = headB;
        while (a != b) {
            a = (a != null) ? a.next : headB;
            b = (b != null) ? b.next : headA;
        }
        return a;
    }
}
