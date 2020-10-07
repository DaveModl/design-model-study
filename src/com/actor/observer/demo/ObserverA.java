package com.actor.observer.demo;

public class ObserverA implements Observer {
    @Override
    public void observer() {
        System.out.println("观察者A...等待结果响应");
    }
}
