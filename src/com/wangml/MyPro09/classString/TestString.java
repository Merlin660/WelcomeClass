package com.wangml.MyPro09.classString;

public class TestString {
    public static void main(String[] args) {

        //编译器做了优化，直接在编译的时候将字符串进行拼接
        String str1 = "hello" + "java";
        String str2 = "hellojava";
        System.out.println(str1==str2); //true

        String str3 = "hello";
        String str4 = "java";
        String str5 = str3 + str4;
        System.out.println(str2==str5); //false
    }
}
