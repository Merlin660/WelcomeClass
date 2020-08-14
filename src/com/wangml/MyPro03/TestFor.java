package com.wangml.MyPro03;

/**
 * for循环:
 * 1.求1到100的和
 * 2.循环输出9-1之间的数
 * 3.输出90-1之间能被3整除的数
 * 4.简单的嵌套循环
 * 5.输出九九乘法表
 */
public class TestFor {
    public static void main(String[] args) {
        //1.求1到100的和
        int sum = 0;
        for (int i=1; i<=100; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);

        //2.循环输出9-1之间的数
        for (int i=9; i>0; i--) {
            System.out.print(i + "、");
        }
        System.out.println();

        //3.输出90-1之间能被3整除的数
        for (int i=90; i>=1; i--) {
            if (i%3 == 0) {
                System.out.print(i + "\t");
            }
        }
        System.out.println();

        //4.简单的嵌套循环
        for (int i=1; i<=5; i++) {
            for (int j=1; j<=5; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }

        //5.输出九九乘法表
        for (int i=1; i<=9; i++) { //i表示行数
            for (int j=1; j<=i; j++) { //j表示列数
                System.out.print(j+"*"+i+"="+i*j+"\t");
            }
            System.out.println();
        }
    }
}
