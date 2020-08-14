package com.wangml.MyPro02;
import java.util.Scanner;
/**
 * 输入一个四位数字后求输出的加密数字。
 * 某个公司采用公用电话传递数据，数据是四位的整数，在传递过程中是加密的，
 * 加密规则如下：每位数字都加上5,然后用和除以10的余数代替该数字，
 * 再将第一位和第四位交换，第二位和第三位交换。
 */
public class TestEncryption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入4位正整数：");
        int i = scanner.nextInt();
        int a, b , c, d;
        d = (i%10+5)%10;
        c = ((i/10)%10+5)%10;
        b = (((i/10)/10)%10+5)%10;
        a = ((((i/10)/10)/10)%10+5)%10;

        System.out.println("加密后的数字为："+ (d*1000+c*100+b*10+a));
    }
}
