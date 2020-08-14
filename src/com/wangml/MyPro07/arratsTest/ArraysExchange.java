package com.wangml.MyPro07.arratsTest;

import java.util.Arrays;

/**
 * 进行数组的排序（从小到大）
 */
public class ArraysExchange {
    //写一个排序的方法
    public static void bubbleSort(int[] values) {
        int temp = 0;
        for (int i=0; i<values.length-1; i++) {
            boolean flag = true;
            for (int j=0; j<values.length-1-i; j++) {
                if (values[j] > values[j+1]) {
                    temp = values[j];
                    values[j] = values[j+1];
                    values[j+1] = temp;

                    flag = false;
                }
                System.out.println(Arrays.toString(values));
            }
            if (flag) {
                System.out.println("结束！！");
                break;
            }
        }

    }
}
