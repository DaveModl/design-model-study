package com.structure.bridge.demo;

/**
 * 扩展抽象化
 */
public class AbsClassImpl extends AbsClass {
    public AbsClassImpl(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void actionAbs() {
        System.out.println("抽象扩展一下");
        implementor.action();
    }

    public static void main(String[] args) {
        Implementor impl = new RealA();
        AbsClass absClass = new AbsClassImpl(impl);
        absClass.actionAbs();
    }
}
