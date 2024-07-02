package LeetCode.Medium;

/*
* Link: https://leetcode.com/problems/remove-nth-node-from-end-of-list
*
* */

public class RemoveNthNodeFromTail {
    public static class ListNode {
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

    public static int getL(ListNode head) {
        int n = 0;
        while (head != null) {
            head = head.next;
            n++;
        }
        return n;
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;
        if (n == getL(head)){
            return head.next;
        }
        int count = 0;
        int l = getL(head);
        ListNode curr = head;
        while (curr != null) {
            if(l-1 - n == count){
                System.out.println("l: " + l + " n: " + n + " count: " + count);
                curr.next = curr.next.next;
                return head;
            }
            count++;
            curr = curr.next;
        }
        return head;
    }
    static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        printList(removeNthFromEnd(n1, 1));
    }
}
