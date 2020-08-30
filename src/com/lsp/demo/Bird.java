package com.lsp.demo;

public class Bird {
    private double flySpeed;
    private String name;

    public double getFlySpeed() {
        return flySpeed;
    }

    public void setFlySpeed(double flySpeed) {
        this.flySpeed = flySpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double calTimeFly(int distance){
        return  distance / flySpeed;
    }
}
