package com.wangml.MyPro05;

public class TestExtents {
    public static void main(String[] args) {
        Student s = new Student("张三", 172, "Java");
        s.rest();
        s.study();
    }
}
class Person {
    String name;
    int height;
    public void rest() {
        System.out.println("休息一会儿！");
    }
}
class Student extends Person {
    String major;
    public void study() {
        System.out.println("在家自学Java!");
    }
    public Student(String name, int height, String major) {
        this.name = name;
        this.height = height;
        this.major = major;
    }
}
