package com.wangml.MyPro03;
/**
 * continue语句：把100~150之间不能被3整除的数输出，并且每行输出5个
 */
public class TestContinue {
    public static void main(String[] args) {
        //for循环
        int count = 0; //定义一个计时器
        for (int i=100; i<=150; i++) {
            if (i%3 == 0){ //判断是否能被3整除
                continue; //能整除则结束后面程序，继续从头开始for循环
            }
            System.out.print(i + "\t");
            count++;
            if (count%5 == 0) {
                System.out.println(); //每行输出5个
            }
        }
    }
}
