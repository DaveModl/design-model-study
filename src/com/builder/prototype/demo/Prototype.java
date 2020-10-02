package com.builder.prototype.demo;

public class Prototype implements Cloneable {
    public Prototype(){
        System.out.println("origin");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("copy");
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype origin = new Prototype();
        Prototype copy = (Prototype) origin.clone();
        System.out.println(origin == copy);
    }
}
