package com.wangml.MyPro05;

public class TestObject {
    public static void main(String[] args) {
//        Object obj;
        Person2 p = new Person2();
        p.age = 20;
        p.name = "张三";
        System.out.println("info:" + p);

        TestObject to = new TestObject();
        System.out.println(to.toString()); //默认返回"类名+@+16进制的hashcode"
    }

    //重写toString()方法
    public String toString() {
        return "测试Object对象";
    }
}

class Person2 {
    String name;
    int age;

    @Override //重写
    public String toString() {
        return name + ", 年龄：" + age;
    }
}
