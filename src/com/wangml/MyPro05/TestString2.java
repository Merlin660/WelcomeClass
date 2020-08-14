package com.wangml.MyPro05;

public class TestString2 {
    public static void main(String[] args) {
        String s1 = "core Java";
        String s2 = "Core Java";
        System.out.println(s1.charAt(3)); //提取下标为3的字符
        System.out.println(s2.length()); //字符串的长度
        System.out.println(s1.equals(s2)); //判断两个字符串是否相等（通用做法）
        System.out.println(s1.equalsIgnoreCase(s2)); //比较两个字符串（忽略大小写）
        System.out.println(s1.indexOf("Java")); //判断s1中是否包含Java
        System.out.println(s1.indexOf("apple")); //判断s1中是否包含apple
        String s = s1.replace(' ', '&'); //将s1中的空格替换成&
        System.out.println("result is:" + s);
    }
}
