package com.structure.proxy.demo;

/**
 * 实际主题
 */
public class Person implements Subject {
    @Override
    public void action() {
        System.out.println("running");
    }
}
