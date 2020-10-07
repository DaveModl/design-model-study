package com.actor.mediator.demo;

public class ConcreteColleague extends Colleague {
    @Override
    public void receive() {
        System.out.println("收到请求");
    }

    @Override
    public void send() {
        System.out.println("收到同类请求");
        mediator.relay(this);
    }
}
