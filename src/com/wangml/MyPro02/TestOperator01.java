package com.wangml.MyPro02;

/**
 * 位运算
 */
public class TestOperator01 {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(a^b);
        System.out.println(~a);

        //移位
        int c = 3 << 2;
        System.out.println(c);
        System.out.println(12 >> 1);
        System.out.println(32 >> 2);


    }
}
