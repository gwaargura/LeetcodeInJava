package LeetCode.Medium;

/*
* STATUS: DONE
* OPTIMIZED: 100%
* DIFFICULTY: MEDIUM
* Description: 2 linked list, value is in reverse (1->2 == 21)
* Add them together, return the linked list (in reverse)
*
* Link: https://leetcode.com/problems/add-two-numbers
* */
public class AddTwoNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode cur = null;
        int carry = 0;
        while (true) {
            int total = 0;
            if (l1 == null && l2 != null) {
                total = l2.val + carry;
            } else if (l1 != null && l2 == null) {
                total = l1.val + carry;
            } else {
                total = l1.val + l2.val + carry;
            }
            carry = 0;
            if (total >= 10) {
                carry = 1;
                total = total - 10;
            }
            if (head == null) {
                head = new ListNode(total);
                cur = head;
            } else {
                cur.next = new ListNode(total);
                cur = cur.next;
            }
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
            if (l1 == null && l2 == null) {
                if (carry == 1) {
                    cur.next = new ListNode(1);
                }
                break;
            }
        }
        return head;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(9);
        ListNode l2 = new ListNode(9);
        ListNode l3 = new ListNode(9);
        ListNode l4 = new ListNode(9);
        ListNode l5 = new ListNode(9);
        ListNode l6 = new ListNode(9);
        ListNode l7 = new ListNode(9);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        l6.next = l7;
        printList(l1);

        ListNode l8 = new ListNode(9);
        ListNode l9 = new ListNode(9);
        ListNode l10 = new ListNode(9);
        ListNode l11 = new ListNode(9);
        l8.next = l9;
        l9.next = l10;
        l10.next = l11;
        printList(l8);

        ListNode l12 = addTwoNumbers(l1, l8);
        printList(l12);

    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
