package com.builder.absfacmethod.demo;

import com.builder.factory.demo.Product;
import com.builder.factory.demo.ProductA;

public class Factory implements AbstractMethodFactory {
    @Override
    public Product make() {
        System.out.println("第一族商品");
        return new ProductA();
    }

    @Override
    public OtherProd makeO() {
        System.out.println("第二族商品");
        return () -> System.out.println("product other");
    }
}
