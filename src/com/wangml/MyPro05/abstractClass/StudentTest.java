package com.wangml.MyPro05.abstractClass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    @Before
    public void setUp() throws Exception {
        System.out.println("测试开始");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("测试结束");
    }

    @Test
    public void study() {
        System.out.println("好好学习，天天向上！！");
    }

    @Test
    public void exam() {
        System.out.println("考试考100分！！");
    }

    @Test
    public void setName() {
    }

    @Test
    public void getName() {
    }
}