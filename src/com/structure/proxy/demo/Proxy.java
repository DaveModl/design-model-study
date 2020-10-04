package com.structure.proxy.demo;

public class Proxy implements Subject {
    private Person person;
    @Override
    public void action() {
        if (person == null){
            person = new Person();
        }
        preAction();
        person.action();
        postAction();
    }

    public void preAction(){
        System.out.println("put on");
    }

    public void postAction(){
        System.out.println("take off");
    }

    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        proxy.action();
    }
}
