package com.wangml.MyPro09.classBaoZhuang;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyIntegerTest {

    @Before
    public void setUp() throws Exception {
        System.out.println("测试开始");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("测试结束");
    }

    @Test
    public void valueOf() {
        MyInteger m = MyInteger.valueOf(300);
        MyInteger n = MyInteger.valueOf(300);
        System.out.println(m==n);
        System.out.println(m);

    }
}