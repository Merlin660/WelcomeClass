package com.wangml.MyPro04;

public class SxtStu {

    //属性fields
    int id;
    String sname;
    int age;

    Computer comp;

    //方法
    void study() {
        System.out.println("我在认真学习！使用电脑：" + comp.brand);
    }

    void play() {
        System.out.println("我正玩游戏！王者农药！");
    }

    SxtStu() {

    }

    //程序执行入口，必须要有
    public static void main(String[] args) {
        SxtStu stu = new SxtStu(); //创建一个对象
        stu.id = 1001;
        stu.sname = "张三";
        stu.age = 18;
        Computer c1 = new Computer();
        c1.brand = "联想";
        stu.comp = c1;
        stu.study();
        stu.play();
    }
}

class Computer {
    String brand; //品牌
}