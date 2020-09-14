package com.example.demo.web;

/**
 * @author xiong
 */
public class Test7 {

    public static void main(String[] args) {
        char[] b = new char[4];
        b[0] = '1';
        b[1] = '2';

        System.out.println(((int)b[0]));
        System.out.println(((int)b[0] - '0'));
        System.out.println(((int)b[1]));
        System.out.println(((int)b[1] - '0'));
    }

}
/**
 [1, 5, 9,  13]
 [2, 6, 10, 14]
 [3, 7, 11, 15]
 [4, 8, 12, 16]

 [13, 9,  5,  1]
 [14, 10,  6,  2]
 [15, 11, 7, , 3]
 [16,12, 8, 4]


 [13,9,5,1]
 [14,10,6,2]
 [15,11,7,3]
 [16,12,8,4]

 00-03-33-30-00
 01-13-32-20-01
 02-23-31-10-02
 11-12-22-21-11


 00-03     i,j = j,length-1-i
 01-13
 02-23
 03-33

 10-02
 11-12
 12-22
 13-32

 20-01
 21-11
 22-21
 23-31

 30-00
 31-10
 32-20
 33-30


 *
 */
