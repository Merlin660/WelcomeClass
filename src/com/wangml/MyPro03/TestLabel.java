package com.wangml.MyPro03;

/**
 * 带标签break和continue：控制嵌套循环跳转(打印101-150之间所有的质数)
 */
public class TestLabel {
    public static void main(String[] args) {
        outer: for (int i=101; i<=150; i++) {
            for (int j=2; j<=i/2; j++) {
                if (i%j == 0) {
                    continue outer;
                }
            }
            System.out.print(i + "\t");
        }
    }
}
