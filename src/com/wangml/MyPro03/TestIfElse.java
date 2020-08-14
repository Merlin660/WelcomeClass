package com.wangml.MyPro03;

/**
 * 测试if-else双选择结构
 */
public class TestIfElse {
    public static void main(String[] args) {
        //猜大小
        int i = ((int)(6*Math.random()+1));
        System.out.println(i);
        if (i > 3){
            System.out.println("大");
        }else{
            System.out.println("小");
        }

        System.out.println("#########################");
        //产生一个[0.0,4.0)区间的半径，并根据半径求圆的面积和周长。
        double r = 4*Math.random();
        double area = Math.PI * Math.pow(r,2);
        double circle = 2 * Math.PI * r;
        System.out.println("半径为："+r);
        System.out.println("面积为："+area);
        System.out.println("周长为："+circle);

        if (area > circle){
            System.out.println("面积大于周长");
        }else{
            System.out.println("周长大于面积");
        }
    }
}
