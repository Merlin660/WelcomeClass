package com.wangml.MyPro03;

/**
 * 测试方法的重载(overload)
 */
public class TestOverload {
    public static void main(String[] args) {
        System.out.println(add(3, 4));
        System.out.println(add(3, 4, 5));
        System.out.println(add(3, 4.0));
        System.out.println(add(3.0, 4));
    }
    //1.初始化方法
    public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }
    //2.重载方法,方法的参数的个数不同，可以构成重载
    public static int add(int a, int b, int c) {
        int sum = a + b + c;
        return sum;
    }
    //3.重载方法,方法的参数的类型不同，可以构成重载
    public static double add(int a, double b) {
        double sum = a + b;
        return sum;
    }
    //4.重载方法，方法的的参数顺序不同，可以构成重载
    public static double add(double a, int b) {
        double sum = a + b;
        return sum;
    }
    /*//5.只有方法的返回值类型不同，不构成重载
    public static double add(int a, int b) {
        double sum = a + b;
        return sum;
    }
    //6.只有方法的参数顺序不同，不构成重载
    public static int add(int b, int a) {
        int sum = a + b;
        return sum;
    }*/

}
