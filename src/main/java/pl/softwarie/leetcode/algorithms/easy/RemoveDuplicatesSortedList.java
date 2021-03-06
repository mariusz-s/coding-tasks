package pl.softwarie.leetcode.algorithms.easy;

import pl.softwarie.leetcode.algorithms.common.ListNode;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list/
 */
public class RemoveDuplicatesSortedList {

    public ListNode deleteDuplicates(ListNode node) {
        ListNode head = node;
        while (node != null) {
            node.next = findNextValue(node.val, node);
            node = node.next;
        }
        return head;
    }

    private ListNode findNextValue(int value, ListNode node) {
        while (node != null && node.val == value) {
            node = node.next;
        }
        return node;
    }
}
