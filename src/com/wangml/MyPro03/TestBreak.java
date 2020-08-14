package com.wangml.MyPro03;

public class TestBreak {
    public static void main(String[] args) {
        int total = 0;
        System.out.println("Begin");
        while (true) {
            total++;
            int i = (int)Math.round(100*Math.random());
            System.out.println(i);
            if (i == 88) {
                break;
            }
        }
        System.out.println("Game Over! Used " + total + " times.");
    }
}
