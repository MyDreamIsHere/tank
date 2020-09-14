package com.example.demo.web;

/**
 * @author xiong
 */
public class Test9 {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode head2 = new ListNode(1);
        head.next = head2;
        ListNode head3 = new ListNode(2);
        head2.next = head3;
        ListNode head4 = new ListNode(1);
        head3.next = head4;

        if (head == null || head.next == null || head.val == head.next.val) {
            System.out.println(true);
        }

        ListNode pre = null;
        ListNode fast = head;
        while (head != null) {
            if (fast != null) {
                //reverse
                ListNode t = head.next;
                ListNode t2 = null;
                if (fast.next != null) {
                    t2 = fast.next.next;
                    head.next = pre;
                    pre = head;
                } else {
                    fast = null;
                }
                head = t;
                fast = t2;
            } else {
                if (pre.val == head.val) {
                    pre = pre.next;
                    head = head.next;
                } else {
                    System.out.println(false);
                    break;
                }
            }
        }
        if (pre == null && head == null) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
