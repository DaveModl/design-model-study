package com.actor.observer.demo;

public class SubjectA extends Subject {
    @Override
    public void notifyAbs() {
        System.out.println("A发生改变");
        for (Observer o: observers){
            o.observer();
        }
    }

    public static void main(String[] args) {
        Subject subject = new SubjectA();
        Observer observer = new ObserverA();
        subject.addObs(observer);
        subject.notifyAbs();
    }
}
