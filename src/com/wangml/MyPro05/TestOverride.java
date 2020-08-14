package com.wangml.MyPro05;

/**
 * 测试重写（override）
 */
public class TestOverride {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        Horse v2 = new Horse();
        Plane v3 = new Plane();
        v1.run();
        v1.stop();
        v2.run();
        v2.stop();
        v3.run();
        v3.stop();
    }
}

class Vehicle {
    public void run() {
        System.out.println("跑......");
    }
    public void stop() {
        System.out.println("停止不动");
    }
}

class Horse extends Vehicle {
    public void run() { //run()方法的重写
        System.out.println("四蹄踢翻，嘚嘚嘚...");
    }
}

class Plane extends Vehicle {
    public void run() { //重写run()方法
        System.out.println("天上飞！");
    }
    public void stop() { //重写stop()方法
        System.out.println("空中不能停，坠机！");
    }
}