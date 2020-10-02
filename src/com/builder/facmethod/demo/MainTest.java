package com.builder.facmethod.demo;

import com.builder.factory.demo.Product;

public class MainTest {
    public static void main(String[] args) {
        AbstractFactory abstractFactory;
        Product a;
        abstractFactory = new AFactory();
        a = abstractFactory.make();
        a.desc();
    }
}
