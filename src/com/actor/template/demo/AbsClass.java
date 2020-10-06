package com.actor.template.demo;

/**
 * 抽象类
 */
public abstract class AbsClass {
    /**
     * 模板方法
     */
    public void templateMethod(){
        method1();
        method2();
        method3();
    }
    public void method1(){
        System.out.println("method1");
    }

    public abstract void method2();
    public abstract void method3();
}
