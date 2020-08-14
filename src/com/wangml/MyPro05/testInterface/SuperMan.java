package com.wangml.MyPro05.testInterface;
//implements实现接口
public class SuperMan implements Volant, Honest {

    @Override
    public void fly() {
        System.out.println("我是超人，我可以横着飞！");
    }

    @Override
    public void stop() {
        System.out.println("竖着停！");
    }

    @Override
    public void helpOther() {
        System.out.println("哪里call我，飞哪里！");
    }
}
