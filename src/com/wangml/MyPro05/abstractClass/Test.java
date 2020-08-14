package com.wangml.MyPro05.abstractClass;

public class Test {
    public static void main(String[] args) {
//        Student s = new Student();   //抽象类不能实例化，即不能new
        Student s = new SxtStu();
        s.study();
        s.study();
    }
}
class SxtStu extends Student {

    @Override
    public void study() {
        System.out.println("好好学习！！");
    }

    @Override
    public void exam() {
        System.out.println("考100分！！");
    }
}