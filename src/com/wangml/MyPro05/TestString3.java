package com.wangml.MyPro05;

public class TestString3 {
    public static void main(String[] args) {
        String s = "";
        String s1 = "How are you?";
        System.out.println(s1.startsWith("How")); //是否以How开头
        System.out.println(s1.endsWith("you")); //是否以you结尾
        s = s1.substring(3); //下标为3的开始到字符串结尾为止
        System.out.println(s);
        s = s1.substring(4, 7); //4开始7结束，不包括7
        System.out.println(s);
        s = s1.toLowerCase(); //转小写
        System.out.println(s);
        s = s1.toUpperCase(); //转大写
        System.out.println(s);
        String s2 = " How are you!! ";
        s = s2.trim(); //去掉字符首尾的空格。注意：中间的空格不能去除
        System.out.println(s);
        System.out.println(s2); //因为String是不可变字符串，所以s2不变

    }
}
