package com.actor.observer.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * 主题
 */
public abstract class Subject {
    protected List<Observer> observers = new ArrayList<>();
    public void addObs(Observer observer){
        observers.add(observer);
    }
    public void removeObs(Observer observer){
        observers.remove(observer);
    }

    public abstract void notifyAbs();
}
