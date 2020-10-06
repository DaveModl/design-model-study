package com.structure.bridge.demo;

/**
 * 抽象化角色
 */
public abstract class AbsClass {
    protected Implementor implementor;

    protected AbsClass(Implementor implementor) {
        this.implementor = implementor;
    }

    public abstract void actionAbs();
}
