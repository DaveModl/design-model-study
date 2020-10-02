package com.creator.singleton.demo;

public class LazySingleton {
    private static volatile LazySingleton instance = null;
    private LazySingleton(){}

    public static synchronized LazySingleton getInstance() {
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
}
