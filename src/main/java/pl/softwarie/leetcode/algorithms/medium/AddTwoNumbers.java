package pl.softwarie.leetcode.algorithms.medium;

/**
 * https://leetcode.com/problems/add-two-numbers/submissions/
 */
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode root = new ListNode(0);
        ListNode node = root;
        int overflow = 0;
        while (null != l1 || null != l2) {
            int a = (l1 == null) ? 0 : l1.val;
            int b = (l2 == null) ? 0 : l2.val;
            int sum = overflow + a + b;
            overflow = sum / 10;
            node.next = new ListNode(sum % 10);
            node = node.next;
            if (null != l1) {
                l1 = l1.next;
            }
            if (null != l2) {
                l2 = l2.next;
            }
        }
        if (overflow > 0) {
            node.next = new ListNode(overflow);
        }
        return root.next;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
