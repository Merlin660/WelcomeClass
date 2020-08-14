package com.wangml.MyPro05;

public class Person01 {
    private String name;
    private int age;
    private boolean flag;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public Person01(String name) {
        this.name = name;
    }
//    public void setAge(int age) {
//        if (age<0||age>150) {
//            System.out.println("年龄不合法！");
//        }else{
//            this.age = age;
//        }
//    }
}
