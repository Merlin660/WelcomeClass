package com.wangml.MyPro03;

/**
 * 测试方法的使用
 */
public class TestMethod {
    public static void main(String[] args) {
        TestMethod tm = new TestMethod();
        tm.add(30, 40, 50);
    }
    void add(int a, int b, int c) {
        int sum = a + b + c;
        System.out.println("sum = " + sum);
    }
}
