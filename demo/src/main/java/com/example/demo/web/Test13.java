package com.example.demo.web;

/**
 * @author xiong
 */
public class Test13 {

    public static void main(String[] args) {
        String s = "anagramb";
        String t = "nagarama";
        if (s.length() != t.length()) {
            System.out.println(false);
        }
        int[] rs = new int[26];
        int[] rt = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int indexs = s.charAt(i) - 97;
            rs[indexs] += 1;

            int indext = t.charAt(i) - 97;
            rt[indext] += 1;
        }
        for (int j = 0; j < 26; j++) {
            if (rs[j] != rt[j]) {
                System.out.println(false);
            }
        }

        System.out.println(true);
    }
}
