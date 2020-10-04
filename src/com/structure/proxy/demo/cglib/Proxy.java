package com.structure.proxy.demo.cglib;


import net.sf.cglib.proxy.Enhancer;

public class Proxy {
    public static void main(String[] args) {
        //代理类创建
        Enhancer enhancer = new Enhancer();
        //指向真实的对象
        //问题TODO
        enhancer.setSuperclass(Actor.class);
        //设置真实对象和代理之间的拦截器
        enhancer.setCallback(new Intercerpetor());
        //代理
        Actor actorProxy = (Actor) enhancer.create();

        actorProxy.action();
    }
}
