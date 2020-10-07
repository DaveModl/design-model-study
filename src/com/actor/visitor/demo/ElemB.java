package com.actor.visitor.demo;

public class ElemB implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    public String operationB() {
        return "operationB";
    }
}
