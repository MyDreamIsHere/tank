package com.example.demo.web;

/**
 * @author xiong
 */
public class Test12 {
    //A man, a plan, a canal: Panama
    //          i              j
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        for (int i = 0, j = s.length() - 1; i != j; ) {
            int start = s.charAt(i);
            int end = s.charAt(j);
            if (!((48 <= start && start <= 57) || (65 <= start && start <= 90) || (97 <= start && start <= 122))) {
                i++;
                continue;
            } else if (65 <= start && start <= 90) {
                start += 32;
            }
            if (!((48 <= end && end <= 57) || (65 <= end && end <= 90) || (97 <= end && end <= 122))) {
                j--;
                continue;
            } else if (65 <= end && end <= 90) {
                end += 32;
            }

            if(start != end){
                System.out.println(false);
                break;
            }else {
                i++;
                j--;
            }
        }
        System.out.println(true);
    }
}
