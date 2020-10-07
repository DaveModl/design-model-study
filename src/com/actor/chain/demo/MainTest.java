package com.actor.chain.demo;

public class MainTest {
    public static void main(String[] args) {
        Handler one = new Person1();
        Handler two = new Person2();
        one.setNext(two);
        one.handleReq("two");
        one.handleReq("three");
    }
}
