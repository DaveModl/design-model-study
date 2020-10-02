package com.creator.singleton.demo;

public class HungrySingleton {
    private static final HungrySingleton instance = new HungrySingleton();
    private HungrySingleton(){}
    private static HungrySingleton getInstance(){
        return instance;
    }

}
