package com.structure.Flyweight.demo;

/**
 * 非享元
 */
public class Unshared {
    private String info;

    public Unshared(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
