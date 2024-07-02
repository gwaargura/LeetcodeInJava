package LeetCode.Easy;

/*
*
* Merge two sorted linked lists
*
* Link: https://leetcode.com/problems/merge-two-sorted-lists
*
* */
public class MergeTwoSortedList {

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

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if(list1 == null) return list2;
        if(list2 == null) return list1;

        ListNode head = new ListNode(0, null);
        ListNode cur = head;

        while (list1 != null && list2 != null) {
            ListNode next = new ListNode();
            if (list1.val <= list2.val) {
                cur.val = list1.val;
                list1 = list1.next;
            } else if (list1.val > list2.val) {
                cur.val = list2.val;
                list2 = list2.next;
            }
            System.out.println("Current Node: " + cur.val);
            cur.next = next;
            cur = cur.next;
        }
        while (list1 != null) {
            cur.val = list1.val;
            list1 = list1.next;
            if(list1 != null) {
                cur.next = new ListNode();
                cur = cur.next;
            }
        }
        while (list2 != null) {
            cur.val = list2.val;
            list2 = list2.next;
            if(list2 != null) {
                cur.next = new ListNode();
                cur = cur.next;
            }
        }
        return head;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MergeTwoSortedList m = new MergeTwoSortedList();
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);
        ListNode node5 = new ListNode(7);
        node1.next = node2;
        node2.next = node3;
        //node3.next = node4;
        //node4.next = node5;

        printList(node1);

        ListNode node6 = new ListNode(1);
        ListNode node7 = new ListNode(3);
        ListNode node8 = new ListNode(4);
        //ListNode node9 = new ListNode(7);
        //ListNode node10 = new ListNode(8);
        node6.next = node7;
        node7.next = node8;
        //node8.next = node9;
        //node9.next = node10;

        printList(node6);

        printList(m.mergeTwoLists(node1, node6));
    }
}
