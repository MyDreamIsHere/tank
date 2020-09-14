package com.example.demo.web;

/**
 * @author xiong
 */
public class Test14 {

    /**
     * "    000001"  1
     * "   -000012 12"  -12
     * "   0+23 2"  0
     * "    0-1"   0
     * "  0000-00002 3" -2
     * "    1000-2"  1000
     *  000-00111111 0
     * @param args
     */

    public static void main(String[] args) {
        System.out.println(new Test14().test("      -11919730356x"));
    }

    public int test(String str){
        StringBuilder sb = new StringBuilder();
        char[] chars = str.toCharArray();
        boolean start = false;
        boolean hasZero = false;
        Integer r = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ' && !start && !hasZero) {
                continue;
            } else {
                if (chars[i] != '-' && chars[i] != '+' && !('0' <= chars[i] && chars[i] <= '9')) {
                    break;
                } else {
                    if ((chars[i] == '-' || chars[i] == '+') && (start || hasZero)) {
                        break;
                    }
                    if(sb.length() == 11){
                        break;
                    }
                    if(chars[i] == '0' && (sb.toString().equals("+") || sb.toString().equals("-"))){
                        continue;
                    }
                    if(chars[i] == '0' && !start){
                        hasZero = true;
                        continue;
                    }
                    sb.append(chars[i]);
                    start = true;
                }
            }
        }
        String rsStr = sb.toString();
        if(rsStr.equals("-") || rsStr.equals("+") || rsStr.length() == 0){
            return 0;
        }
        try {
            r = Integer.parseInt(rsStr);
        }catch (Exception e){
            if(rsStr.startsWith("-")){
                r =  Integer.MIN_VALUE;
            }else {
                r = Integer.MAX_VALUE;
            }
        }
        return r;
    }


}
