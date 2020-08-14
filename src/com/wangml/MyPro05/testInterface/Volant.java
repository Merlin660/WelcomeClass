package com.wangml.MyPro05.testInterface;

public interface Volant {
    /**
     * 表示飞行器在地球这个星球上飞行的最高高度，单位是：公里
     */
    int MAX_HIGHT = 1000;

    /**
     * 飞行方法。
     */
    void fly();
    void stop();

}

/**
 * 善良的方法。
 */
interface Honest {
    void helpOther();
}
