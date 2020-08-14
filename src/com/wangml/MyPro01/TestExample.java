package com.wangml.MyPro01;

/**
 * 1. 用while循环分别计算100以内的奇数及偶数的和，并输出。
 * 2. 用while循环或其他循环输出1-1000之间能被5整除的数，且每行输出5个。
 */
public class TestExample {
    public static void main(String[] args) {
        //1. 用while循环分别计算100以内的奇数及偶数的和，并输出。
        int i = 1;
        int sum01 = 0;
        int sum02 = 0;

        while (i <= 100) {
            if (i%2 == 0) {
                sum01 += i;
            }else{
                sum02 += i;
            }
            i++;
        }
        System.out.println("奇数和为：" + sum02);
        System.out.println("偶数和为：" + sum01);

        System.out.println("#####################################");
        //2. 用while循环或其他循环输出1-1000之间能被5整除的数，且每行输出5个。
        //for循环
        for (int m=1; m<=1000; m++) {
            if (m%5 == 0) {
                System.out.printf(m+"\t");
            }
            if (m%25 == 0) {
                System.out.println();
            }

        }
        System.out.println("#################################");
        //while循环
        i = 1;
        while (i <= 1000) {
            if (i%5 == 0) {
                System.out.printf(i+"\t");
            }
            if (i%25 == 0) {
                System.out.println();
            }
            i++;
        }
    }
}
