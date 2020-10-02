package com.creator.singleton.demo;

public class StaticSingleton {
    private StaticSingleton(){}

    /**
     * lazy-static-innerClass
     */
    private static class StaticSingletonHolder{
        private static final StaticSingleton instance = new StaticSingleton();
    }
    public static StaticSingleton getInstance(){
        return StaticSingletonHolder.instance;
    }
}
