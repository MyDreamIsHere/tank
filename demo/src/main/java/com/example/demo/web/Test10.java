package com.example.demo.web;

/**
 * @author xiong
 */
public class Test10 {

    public static void main(String[] args) {
        /*ListNode head = new ListNode(1);

        Set<Integer> set = new HashSet<Integer>();
        int i=0;
        while (head != null){
            int v = Integer.valueOf((i+head.val)).hashCode();
            if(set.contains(v)){
                return true;
            }else {
                set.add();
            }
            head = head.next;

        }*/
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
