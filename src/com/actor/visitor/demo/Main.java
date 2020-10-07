package com.actor.visitor.demo;

public class Main {
    public static void main(String[] args) {
        ObjList objList =new ObjList();
        objList.add(new ElemA());
        objList.add(new ElemB());
        Visitor visitor=new AVisitor();
        objList.accept(visitor);
    }
}
