package com.wangml.MyPro09.classBaoZhuang;

public class WrapperClassTest {
    public static void main(String[] args) {
        Integer i = new Integer(10); //从java9开始废弃
        Integer j = new Integer(50); //已经被废弃，不推荐使用
        Integer m = Integer.valueOf(10); //官方推荐使用

        //Integer对象转化成double
        double d = i.doubleValue();

        System.out.println(i);
        System.out.println(j);
        System.out.println(m);

        System.out.println(d);

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
    }
}
