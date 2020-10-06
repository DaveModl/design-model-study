package com.structure.decorator.demo;

/**
 * 具体装饰者
 */
public class ConcreteDecorator extends Decorator {
    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void action() {
        super.action();
        addFunc();
    }

    public void addFunc(){
        System.out.println("aaaa");
    }
}
