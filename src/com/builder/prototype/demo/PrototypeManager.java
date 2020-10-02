package com.builder.prototype.demo;

import java.util.HashMap;
import java.util.Map;

/**
 * 多实例管理器
 */
public class PrototypeManager {
    private Map<String,Object> manager = new HashMap<>();
    public PrototypeManager(){
        manager.put("print",new PrintObj());
    }
    public void setManager(String key,Object obj){
        manager.put(key,obj);
    }

    public Object getManager(String key){
        return manager.get(key);
    }

}
