package com.wangml.MyPro04;

public class TestThis {
    int id;
    String name;
    String pwd;

    public TestThis() {
    }
    public TestThis(int id, String name) {
        System.out.println("正在初始化已经创建好的对象：" + this);
        this.id = id;
        this.name = name;
    }
    public void login() {
        System.out.println(this.name + ",要登录！"); //不写this效果一样
    }

    public static void main(String[] args) {
        TestThis tt1 = new TestThis(101,"南瓜");
        System.out.println("打印南瓜对象：" + tt1);
        tt1.login();
    }
}
