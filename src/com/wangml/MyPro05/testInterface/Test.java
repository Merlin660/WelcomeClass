package com.wangml.MyPro05.testInterface;

public class Test {
    public static void main(String[] args) {
        Volant m1 = new SuperMan();
        m1.fly();
        Honest h = (Honest) m1;
        h.helpOther();
    }
}
