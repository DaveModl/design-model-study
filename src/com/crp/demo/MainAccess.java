package com.crp.demo;

/**
 * 合成复用原则：集合优先于继承考虑
 */
public class MainAccess {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle(new Color("red"));
        GasCar gasCar = new GasCar(new Color("white"));
        bicycle.move();
        gasCar.move();
    }
}
