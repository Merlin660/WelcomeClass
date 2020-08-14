package com.wangml.MyPro07.arrays;

public class Test03 {
    public static void main(String[] args) {
        int[] a = new int[4];
        //初始化数组元素的值,读取数值
        for (int i=0; i<a.length; i++){
            a[i] = 100*i;
            System.out.println(a[i]);
        }

        System.out.println("#####################");
        for (int m:a){
            System.out.println(m);
        }
    }
}
