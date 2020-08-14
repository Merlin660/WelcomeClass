package com.wangml.MyPro03;

/**
 * while循环结构：求1到100之间的累加和
 */
public class TestWhile {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;

        while (i <= 100) {
            sum += i;
            i++;
        }
        System.out.println("sum = " + sum);
    }
}
