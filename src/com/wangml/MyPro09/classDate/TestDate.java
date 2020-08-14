package com.wangml.MyPro09.classDate;

import java.util.Date;

public class TestDate {
    public static void main(String[] args) {
//        long a1 = Long.MAX_VALUE;
//        System.out.println(a1);
        long a = Long.MAX_VALUE/(1000L*3600*24*365);
        System.out.println(a); //大约表示到2.9亿年后

        long nowNum = System.currentTimeMillis(); //表示此时刻的毫秒数
        System.out.println(nowNum);

        Date d1 = new Date();
        System.out.println(d1); //获得系统当前的时间
        System.out.println(d1.getTime()); //获得当前时间的毫秒数


        Date d2 = new Date(1000L*3600*24*365*250);
        System.out.println(d2);

    }
}
