package com.example.demo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiong
 */
@RestController
public class HelloWorldController {

    @RequestMapping("/hello")
    public Object helloWorld() {
        return "hello world";
    }

    public static void main(String[] args) {
        String[] arr = new String[]{"hello", "world", "leetcode"};
        System.out.println(countCharacters(arr, "welldonehoneyr"));
    }

    public static int countCharacters(String[] words, String chars) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            String temp = chars;
            int k = 0;
            for (int j = 0; j < words[i].length(); j++) {
                char c = words[i].charAt(j);
                int index = temp.indexOf(c);
                if (index != -1) {
                    String t = temp;
                    temp = t.substring(0, index) + t.substring(index + 1, t.length());
                    k++;
                } else {
                    break;
                }
            }
            if (k == words[i].length()) {
                count += k;
            }
        }
        return count;
    }
}
