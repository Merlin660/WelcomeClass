package com.wangml.MyPro07.classStudent;

class Student {

    private long id;
    private String name;
    private double Java;
    private double Python;
    private double JavaScript;

    public Student() {
        this.id=123456789;
        this.name="张三";
        this.Java=60.0;
        this.Python=60.1;
        this.JavaScript=59.9;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Student{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", Java=").append(Java);
        sb.append(", Python=").append(Python);
        sb.append(", JavaScript=").append(JavaScript);
        sb.append('}');
        return sb.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getJava() {
        return Java;
    }

    public void setJava(double Java) {
        this.Java = Java;
    }

    public double getPython() {
        return Python;
    }

    public void setPython(double Python) {
        this.Python = Python;
    }

    public double getJavaScript() {
        return JavaScript;
    }

    public void setJavaScript(double JavaScript) {
        this.JavaScript = JavaScript;
    }

    /**
     * 计算学生成绩总分
     */
    public double sum() {
        return this.Java + this.Python + this.JavaScript;
    }
}