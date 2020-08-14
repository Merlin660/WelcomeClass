package com.wangml.MyPro03;

/**
 * 测试递归（recursion）
 * 1. 递归：计算n!
 * 2.循环：计算n！
 */
public class TestRecursion {
    public static void main(String[] args) {
        //1.递归：计算n!
        long d1 = System.currentTimeMillis();
        System.out.printf("%d阶乘的结果：%s%n", 10, factorial(10));
        long d2 = System.currentTimeMillis();
        System.out.printf("递归费时：%s%n", d2 - d1); //耗时

        factorialLoop(10);

    }

    /**
     * 求阶乘的方法{
     * 1.递归
     * 2.循环
     * }
     */
    //1.递归
    static long factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1); //n! = n * (n - 1)!
        }
    }

    //2.循环
    static long factorialLoop(int a) {
        long d3 = System.currentTimeMillis();
        int result = 1;
        for (; a> 0; a-=2) {
            result *= a * (a - 1);
        }
        long d4 = System.currentTimeMillis();
        System.out.println(result);
        System.out.printf("普通循环费时：%s%n", d4 - d3);
        return result;
    }

}
