package com.structure.proxy.demo.jdk;

public class Cat implements JdkSubject {
    @Override
    public void action() {
        System.out.println("miao~~miao~~");
    }
}
