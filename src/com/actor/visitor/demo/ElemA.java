package com.actor.visitor.demo;

public class ElemA implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    public String operationA() {
        return "operationA";
    }
}
