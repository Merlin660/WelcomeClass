package com.wangml.MyPro07.arrays;

public class Test01 {
    public static void main(String[] args) {
        int[] arr01 = new int[10];
        String arr02[] = new String[5];
        User[] u = new User[3];

        arr01[0] = 13;
        arr01[1] = 15;
        arr01[2] = 20;
        /**
         * 通过循环初始化数组
         * 通过循环读取数组里面元素的值
         */
        for (int i=0; i<arr01.length; i++){
            arr01[i] = 10*i;
            System.out.println(arr01[i]);
        }

        //通过循环读取数组里面元素的值
//        for (int i=0; i<arr01.length; i++){
//            System.out.println(arr01[i]);
//        }

        User[] arr03 = new User[3];
        arr03[0] = new User(1001,"高效");
        arr03[1] = new User(1002,"高效2");
        arr03[2] = new User(1003,"高效3");

        for (int i=0; i<arr03.length; i++){
            System.out.println(arr03[i].getName());
        }
    }
}

