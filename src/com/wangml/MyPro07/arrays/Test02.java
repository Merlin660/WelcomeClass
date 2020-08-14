package com.wangml.MyPro07.arrays;

public class Test02 {
    public static void main(String[] args) {
        //静态初始化
        int[] a = {2,3,4};
        User[] b = {
                    new User(1001,"高噶"),
                    new User(1002,"高空"),
                    new User(1003,"哈酒")
                    };
        //数组默认初始化
        int[] b2 = new int[3];

        //动态初始化
        int[] a1 = new int[10];
        a1[0] = 12;
        a1[1] = 13;
        a1[2] = 15;

    }
}
