package com.example.demo.web;

/**
 * @author xiong
 */
public class Test6 {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,2,1,3,4,4,5,6,6,5};
        int rs = 0;
        for (int i:arr) {
            rs = rs ^ i;
        }
        System.out.println(rs);
    }
}
