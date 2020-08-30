package com.crp.demo;

public class Bicycle extends Car {
    public Bicycle(Color color) {
        super(color);
    }

    @Override
    public void move() {
        System.out.println(super.getColor().getColor()+" bicycle moving");
    }
}
