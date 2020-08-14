package com.wangml.MyPro09.classBaoZhuang;

/**
 * 自定义一个包装类MyInteger
 */
public class MyInteger {
    private int value;
    private static MyInteger[] cache = new MyInteger[256];

    public static final int LOW = -128;
    public static final int HIGH = 127;

    static {
        //[-128,127]
        for (int i=LOW;i<=HIGH;i++) {
            //-128,0;-127,1;-126,2
            cache[i+128] = new MyInteger(i);
        }
    }

    public static MyInteger valueOf(int i) {
        if(i>=LOW&&i<=HIGH) {
            return cache[i+128];
        }
        return new MyInteger(i);
    }


    /**
     *字符串转为数字
     */
    @Override
    public String toString() {
        return this.value + "";
    }

    private MyInteger(int i) {
        this.value = i;
    }

    public static void main(String[] args) {
        MyInteger m = MyInteger.valueOf(300);
        MyInteger n = MyInteger.valueOf(300);
        System.out.println(m==n);
        System.out.println(m);
    }

}
