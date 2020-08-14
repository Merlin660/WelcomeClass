package com.wangml.MyPro05.polymorphism;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DogTest {

    @Before
    public void setUp() throws Exception {
        System.out.println("测试开始");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("测试结束");
    }

    @Test
    public void shut() {
        System.out.println("汪汪汪！");
    }

    @Test
    public void seeDoor() {
        System.out.println("看大门！");
    }
}