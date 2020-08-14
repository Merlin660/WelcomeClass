package com.wangml.MyPro08.test;

public class TestWrappedClass {
    public static void main(String[] args) {
        //基本数据类型转成包装类对象
        Integer a = new Integer(3);

        String[] ss = {"aa","bbb","ccc","ddd"};

        for (String temp:ss){
            System.out.println(temp);
        }
    }
}
