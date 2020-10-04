package com.structure.proxy.demo.jdk;

public class MainTest {
    public static void main(String[] args) {
        JdkSubject subject = new JdkProxy(new Cat()).getProxy();
        subject.action();
    }
}
