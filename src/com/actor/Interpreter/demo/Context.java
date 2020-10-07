package com.actor.Interpreter.demo;

public class Context {
    private Expression expression;
    public Context(){}
    public void action(String info){
        expression.interpreter(info);
    }
}
