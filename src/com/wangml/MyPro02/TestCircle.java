package com.wangml.MyPro02;
import java.util.Scanner;
/**
 * 求圆的半径、周长和面积
 */
public class TestCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入圆的半径：");
        double r = scanner.nextDouble();
        System.out.println("该圆的半径为："+"R = "+r);
        double circle = 2*3.14*r;
        double area = 3.14*Math.pow(r,2);
        System.out.println("该圆的周长为："+"C = 2*3.14*"+r+"="+circle);
        System.out.println("该圆的面积为："+"S = 3.14*"+r+"*"+r+"="+area);
    }
}
