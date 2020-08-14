package com.wangml.MyPro05.abstractClass;

public abstract class Student {

    private String name;

    abstract public void study();
    abstract public void exam();


    public Student(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    Student() {}
}
