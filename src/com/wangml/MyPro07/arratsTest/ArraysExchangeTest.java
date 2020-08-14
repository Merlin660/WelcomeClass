package com.wangml.MyPro07.arratsTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ArraysExchangeTest extends ArraysExchange {

    @Before
    public void setUp() throws Exception {
        System.out.println("测试开始");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("测试结束");
    }

    @Test
    public void bubbleSort() {
        int[] values = { 3, 1, 6, 2, 9, 0, 7, 4, 5, 8 };
        bubbleSort(values);
        System.out.println(Arrays.toString(values));
    }
}