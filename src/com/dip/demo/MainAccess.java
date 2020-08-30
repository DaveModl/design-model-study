package com.dip.demo;

/**
 * 依赖倒置:解耦，复用，抽象出通用的行为
 */
public class MainAccess {
    public static void main(String[] args) {
        Customer c1 = new Customer();
        c1.goShop(new Market1());
        c1.goShop(new Market2());
    }
}
