package com.wangml.MyPro02;

/**
 * 测试标识符的用法
 * @author Merlin
 */
public class TestIdentifer {
    public static void main(String[] args) {
        int a123 = 1;
        //int 123a = 2; //数字不能作为开头
        int $a = 3;
        int _abc = 4;
        //int #abc = 5; //特殊字符不能作为开头
        int 年龄 = 18; //可以使用汉字，但是一般不建议使用
        //int class = 6; //关键字不能作为标识符
    }
}
