package com.actor.order.demo;

/**
 * 具体命令
 */
public class Order implements Command {
    private Receiver receiver;
    Order(){
        receiver = new Receiver();
    }
    @Override
    public void order() {
        System.out.println("第一个order...");
        receiver.action();
    }
}
