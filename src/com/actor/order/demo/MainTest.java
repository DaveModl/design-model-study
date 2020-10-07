package com.actor.order.demo;

public class MainTest {
    public static void main(String[] args) {
        Command command = new Order();
        Invoke invoke = new Invoke(command);
        invoke.request();
    }
}
