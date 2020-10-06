package com.structure.decorator.demo;

public class ConcreteComponent implements Component {
    public ConcreteComponent() {
        System.out.println("concrete");
    }

    @Override
    public void action() {
        System.out.println("do action");
    }
}
