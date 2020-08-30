package com.crp.demo;

public class Car {
    private Color color;

    public Car(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void move(){
        System.out.println(color.getColor() +" car moving");
    }
}
