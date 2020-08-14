package com.wangml.MyPro09.classBaoZhuang;

public class Test {
    //测试Integer的用法，其他包装类与Integer类似
    void testInteger(){
        Integer int1 = new Integer(10); //已经被废弃，不推荐使用
        Integer int2 = Integer.valueOf(20); //官方推荐使用
        //Integer对象转化成int
        int a = int1.intValue();
        //字符串转化成Integer对象
        Integer int3 = Integer.parseInt("334");
        Integer int4 = new Integer("999");
        //自动装箱
        Integer int5 = 5; //编译器帮你改成：Integer int5 = Integer.valueOf(5);
        //自动拆箱
        int i = int3;

        //空指针
        Integer b = null;
        int c = b; // java.lang.NullPointerException


        //Integer对象转化成字符串
        String str1 = int3.toString();
        //一些常见int类型相关的常量
        System.out.println("int能表示的最大整数："+Integer.MAX_VALUE);

//        System.out.println(i);
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.testInteger();
    }

}
