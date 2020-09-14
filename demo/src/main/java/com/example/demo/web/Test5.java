package com.example.demo.web;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author xiong
 */
public class Test5 {

    public static void main(String[] args) {
        int[] array = new int[]{8,1,2,2,3};

        List<Integer> list = Arrays.stream(array).boxed().sorted().collect(Collectors.toList());
        int[] rs = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            rs[i] = list.indexOf(array[i]);
            System.out.print(rs[i] + " ");
        }

    }
}
