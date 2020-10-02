package com.creator.facmethod.demo;

import com.creator.factory.demo.Product;
import com.creator.factory.demo.ProductA;

public class AFactory implements AbstractFactory {
    @Override
    public Product make() {
        System.out.println("product A");
        return new ProductA();
    }
}
