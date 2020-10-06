package com.structure.Flyweight.demo;

public class ConcreteShared implements Shared {
    private String flag;
    ConcreteShared(String flag){
        this.flag = flag;
        System.out.println("shared " + flag);
    }
    @Override
    public void action(Unshared unshared) {
        System.out.println("shared " + flag);
        System.out.println(unshared.getInfo());
    }
}
