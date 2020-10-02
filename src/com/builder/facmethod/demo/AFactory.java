package com.builder.facmethod.demo;

import com.builder.factory.demo.Product;
import com.builder.factory.demo.ProductA;

public class AFactory implements AbstractFactory {
    @Override
    public Product make() {
        System.out.println("product A");
        return new ProductA();
    }
}
