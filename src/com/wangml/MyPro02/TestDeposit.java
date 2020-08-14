package com.wangml.MyPro02;
/**
 * 利用银行利率计算利息
 */
public class TestDeposit {
    public static void main(String[] args) {
        int B = 10000;
        System.out.println("本金："+B);

        System.out.println("活期1年本金总计："+Math.round(B*(1+0.0035)));
        System.out.println("定期1年本金总计："+Math.round(B*(1+0.015)));
        System.out.println("活期2年本金总计："+Math.round(B*(1+0.0035*2)));
        System.out.println("定期2年本金总计："+Math.round(B*(1+0.021*2)));
    }
}
