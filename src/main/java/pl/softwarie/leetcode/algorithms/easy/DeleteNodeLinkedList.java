package pl.softwarie.leetcode.algorithms.easy;

import pl.softwarie.leetcode.algorithms.ListNode;

/**
 * https://leetcode.com/problems/delete-node-in-a-linked-list/
 */
public class DeleteNodeLinkedList {

    public void deleteNode(ListNode node) {
        if (node.next == null) {
            return;
        }
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
