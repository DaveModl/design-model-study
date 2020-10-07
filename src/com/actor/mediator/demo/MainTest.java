package com.actor.mediator.demo;

public class MainTest {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        Colleague colleague = new ConcreteColleague();
        Colleague colleague2 = new ConcreteColleague2();
        mediator.register(colleague);
        mediator.register(colleague2);
        colleague.send();
        colleague2.send();

    }
}
