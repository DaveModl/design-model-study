package com.structure.decorator.demo;

/**
 * 装饰着
 */
public class Decorator implements Component {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void action() {
        component.action();
    }
}
