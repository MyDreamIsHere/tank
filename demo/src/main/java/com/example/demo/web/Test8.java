package com.example.demo.web;

/**
 * @author xiong
 */
public class Test8 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode head2 = new ListNode(2);
        head.next = head2;
        ListNode head3 = new ListNode(3);
        head2.next = head3;
        ListNode head4 = new ListNode(4);
        head3.next = head4;
        ListNode head5 = new ListNode(5);
        head4.next = head5;
        ListNode head6 = new ListNode(6);
        head5.next = head6;

        ListNode pre = null;
        ListNode curr = head;
        ListNode t = null;
        while (curr != null) {
            t = curr.next;
            curr.next = pre;
            pre = curr;
            curr = t;
        }

        System.out.println(1);

    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
/**
 *
 * A->B->C->D->E
 *
 *
 * E->D->C->B->A
 *
 * R.next = N;
 * N = head;
 *
 * while(head != null){
 *     N = head.next;  // N = cde
 *     N.next = new Node(head.val);  // ba
 *     N.next.next = T;
 *     T = N;
 *     head = head.next;
 * }
 *
 *
 *
 *
 *



 */
}