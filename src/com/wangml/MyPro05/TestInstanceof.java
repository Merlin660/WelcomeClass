package com.wangml.MyPro05;

/**
 * instanceof用来判断左边的对象是不是右边的子类
 * 用法：对象 instanceof 对象（类）
 */
public class TestInstanceof {
    public static void main(String[] args) {
        Student s = new Student("张三", 183,"Java");
        System.out.println(s instanceof Person);
        System.out.println(s instanceof Student);
    }
}
