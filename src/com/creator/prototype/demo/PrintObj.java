package com.creator.prototype.demo;

public class PrintObj implements CommonPrototype {
    @Override
    public Object clone() {
        PrintObj obj = null;
        try {
            obj = (PrintObj) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return obj;
    }

    @Override
    public void doAction() {
        System.out.println("Hello");
    }
}
