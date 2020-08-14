package com.wangml.MyPro07.arratsTest;

import java.util.Arrays;

public class Test extends ArraysExchange {
        public static void main(String[] args) {
        int[] values = { 3, 1, 6, 2, 9, 0, 7, 4, 5, 8 };
        bubbleSort(values);
        System.out.println(Arrays.toString(values));
    }
}
