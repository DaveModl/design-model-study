package com.structure.Flyweight.demo;

public class MainTest {
    public static void main(String[] args) {
       SharedFactory sharedFactory = new SharedFactory();
        Shared shared1 = sharedFactory.getMap("a");
        Shared shared2 = sharedFactory.getMap("a");
        Shared shared3 = sharedFactory.getMap("b");
        shared1.action(new Unshared("第1次调用a"));
        shared2.action(new Unshared("第2次调用a"));
        shared3.action(new Unshared("第1次调用b"));
    }
}
