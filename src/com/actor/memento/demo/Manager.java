package com.actor.memento.demo;

public class Manager {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }

    public static void main(String[] args) {
        Origin origin = new Origin();
        origin.setState("1");
        System.out.println(origin);
        Manager manager = new Manager();
        manager.setMemento(origin.createMemento());
        origin.setState("2");
        System.out.println(origin);
        origin.reset(manager.getMemento());
        System.out.println(origin);

    }
}
