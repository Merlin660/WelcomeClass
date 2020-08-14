package com.wangml.MyPro05;

public class TestString {
    public static void main(String[] args) {
        String str = "ee";
        String str2 = new String("ee");
        String str3 = "abc" + "def";
        String str4 = "12" + 18;
        System.out.println(str4); //不是加法，是字符串连接符。

        System.out.println(str == str2);

        //通常用equals来进行字符串的比较。
        System.out.println(str.equals(str2));


    }
}
