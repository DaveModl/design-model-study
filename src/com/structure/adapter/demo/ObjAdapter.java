package com.structure.adapter.demo;

public class ObjAdapter implements ObjectTarget {
    private ObjAdaptor adaptor;

    public ObjAdapter(ObjAdaptor adaptor) {
        this.adaptor = adaptor;
    }

    @Override
    public void action() {
        adaptor.doSomething();
    }


    public static void main(String[] args) {
        ObjAdaptor adaptor = new ObjAdaptor();
        ObjectTarget target = new ObjAdapter(adaptor);
        target.action();
    }

}
