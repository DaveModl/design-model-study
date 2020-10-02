package com.builder.facmethod.demo;

import com.builder.factory.demo.Product;
import com.builder.factory.demo.ProductB;

public class BFactory implements AbstractFactory{
    @Override
    public Product make() {
        System.out.println("product B");
        return new ProductB();
    }
}
