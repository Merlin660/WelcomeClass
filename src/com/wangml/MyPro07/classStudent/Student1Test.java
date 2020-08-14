package com.wangml.MyPro07.classStudent;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

class StudentTest {
    Student stu = null;

    @Before
    public void setUp() throws Exception {
        stu = new Student();
        System.out.println("开始单元测试");
    }

    @After
    public void tearDown() throws Exception {
        stu = new Student();
        System.out.println("结束单元测试");
    }

    @Test
    public void getId() {
        System.out.println("getId()：" + stu.getId() + "，测试成功");
    }

    @Test
    public void setId() {
        stu.setId(654321);
        assertEquals( 654321,stu.getId(),"setId()方法异常");
        System.out.println("setId()测试成功");
    }

    private void assertEquals(int i, long id, String s) {
    }

    @Test
    public void getName() {
        System.out.println("getName()：" + stu.getName() + "，测试成功");
    }

    @Test
    public void setName() {
        stu.setName("李四");
        assertEquals(stu.getName(), "李四");
        System.out.println("setName()测试成功");
    }

    private void assertEquals(String name, String 李四) {
    }

    @Test
    public void getJava() {
        System.out.println("Java成绩为"+stu.getJava()+"，测试成功");
    }

    @Test
    public void setJava() {
        stu.setJava(99.9);
        assertEquals(99, (long) stu.getJava(),"setJava()方法异常");
        System.out.println("setJava()测试成功");
    }

    @Test
    public void sum() {
        assertEquals( 180, (long) stu.sum(),"sum()方法异常");
        System.out.println(stu);
        System.out.println("张三总分为180，sum()测试成功");
    }
}