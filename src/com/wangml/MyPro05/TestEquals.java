package com.wangml.MyPro05;

import java.util.Objects;

/**
 * equals方法测试和自定义类重写equals方法
 */
public class TestEquals {
    public static void main(String[] args) {
        Object obj;
        String str;

        User u1 = new User(1000, "宋正宗", "123456");
        User u2 = new User(1001, "宋轶", "123456");

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));
    }
}

class User {
    int id;
    String name;
    String pwd;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public User(int id, String name, String pwd) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }
}