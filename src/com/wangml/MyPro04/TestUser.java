package com.wangml.MyPro04;

public class TestUser {
    int id; // id
    String name; // 账户名
    String pwd; // 密码
    public TestUser() {

    }
    public TestUser(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }
    public TestUser(int id, String name, String pwd) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }
    public static void main(String[] args) {
        TestUser u1 = new TestUser();
        TestUser u2 = new TestUser(101, "高小七");
        TestUser u3 = new TestUser(100, "高淇", "123456");
//        System.out.println(u3.id);
    }
}
