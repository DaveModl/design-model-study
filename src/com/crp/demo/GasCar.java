package com.crp.demo;

public class GasCar extends Car {
    public GasCar(Color color) {
        super(color);
    }

    @Override
    public void move() {
        System.out.println(super.getColor().getColor() + " gas car moving");
    }
}
