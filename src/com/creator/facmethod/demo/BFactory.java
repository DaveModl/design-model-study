package com.creator.facmethod.demo;

import com.creator.factory.demo.Product;
import com.creator.factory.demo.ProductB;

public class BFactory implements AbstractFactory{
    @Override
    public Product make() {
        System.out.println("product B");
        return new ProductB();
    }
}
