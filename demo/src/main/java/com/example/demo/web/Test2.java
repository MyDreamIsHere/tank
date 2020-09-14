package com.example.demo.web;

/**
 * @author xiong
 */
public class Test2 {

    public static void main(String[] args) throws Exception {
        String date = "2003-03-01";
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int rs = Integer.parseInt(date.substring(8, 10));

        for (int i = 1; i < month; i++) {
            if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                rs += 31;
            } else if (i == 4 || i==6 || i==9 || i==11) {
                rs += 30;
            }else {
                rs+= 28;
            }
        }

        if ((year % 4 == 0 && year % 100 != 0 || year % 400 == 0) && month > 2) {
            ++rs;
        }

        System.out.println(rs);
    }
}
