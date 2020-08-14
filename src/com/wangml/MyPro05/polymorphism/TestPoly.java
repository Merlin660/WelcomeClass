package com.wangml.MyPro05.polymorphism;

public class TestPoly {

    static void AnimalCry(Animal a) {
        a.shut();
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        AnimalCry(d);
        d.seeDoor();
        AnimalCry(new Cat());
    }
}
