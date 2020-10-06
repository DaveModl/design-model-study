package com.structure.Flyweight.demo;

import java.util.HashMap;
import java.util.Map;

public class SharedFactory {
    private Map<String,Shared> map = new HashMap<>();

    public Shared getMap(String key) {
        Shared shared = map.get(key);
        if (shared != null){
            System.out.println("get");
        }else {
            shared = new ConcreteShared(key);
            map.put(key,shared);
        }
        return shared;
    }


}
