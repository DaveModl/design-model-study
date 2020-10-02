package com.builder.singleton.demo;

public class ThreadSingleton {
    //防止指令重排序
    private static volatile ThreadSingleton instance;
    private ThreadSingleton(){}

    public static ThreadSingleton getInstance(){
        if (instance == null){
            synchronized (ThreadSingleton.class){
                if (instance == null){
                    instance = new ThreadSingleton();
                }
            }
        }
        return instance;
    }
}
