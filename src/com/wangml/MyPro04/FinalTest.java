package com.wangml.MyPro04;

import static java.lang.Math.PI;
/**
 * 定义一个圆类——Circle，在类的内部提供一个属性：半径(r)，同时 提供 两个 方 法 ：
 * 计算 面积 ( getArea() ) 和 计算 周长(getPerimeter()) 。
 * 通过两个方法计算圆的周长和面积并且对计算结果进行输出。最后定义一个测试类对 Circle 类进行使用。
 */
class Circle {
    double r;
    Circle(double r){
        this.r = r;
    }
    public void getArea() {
        double Area;
        Area = PI * r * r;
        System.out.println("该圆的面积为：" + Area);
    }
    public void getPerimeter() {
        double Perimeter;
        Perimeter = 2 * PI * r;
        System.out.println("该圆的周长为：" + Perimeter);
    }
}
public class FinalTest{
    public static void main(String[] args) {
        Circle c = new Circle(5.0);
        c.getArea();
        c.getPerimeter();
    }
}


