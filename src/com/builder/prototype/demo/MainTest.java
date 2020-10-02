package com.builder.prototype.demo;

public class MainTest {
    public static void main(String[] args) {
        PrototypeManager pm = new PrototypeManager();
        PrintObj print = (PrintObj) pm.getManager("print");
        print.doAction();
    }
}
