package com.example.demo;

import org.junit.Test;

/**
 * @author xiong
 */
public class Test1 {

    int[] array = new int[]{1, 2, 2, 3, 4, 4, 3};

    @Test
    public boolean test() {
        int length = array.length;
        if (length % 2 != 1) {
            return false;
        }
        int num = 0;
        int total = 0;
        for (int i = 0; i < length; i++) {
        }
        return true;
    }
}
