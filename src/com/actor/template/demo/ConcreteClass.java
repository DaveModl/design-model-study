package com.actor.template.demo;

public class ConcreteClass extends AbsClass {
    @Override
    public void method2() {
        System.out.println("method2");
    }

    @Override
    public void method3() {
        System.out.println("method3");
    }

    public static void main(String[] args) {
        AbsClass absClass = new ConcreteClass();
        absClass.templateMethod();
    }
}
