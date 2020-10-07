package com.actor.visitor.demo;

public class AVisitor implements Visitor {
    @Override
    public void visit(ElemA a) {
        System.out.println("AVisitor " + a.operationA());
    }

    @Override
    public void visit(ElemB b) {
        System.out.println("AVisitor " + b.operationB());
    }
}
