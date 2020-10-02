package com.builder.facmethod.demo;

import com.builder.factory.demo.Product;

/**
 * 只生产一类商品
 */
public interface AbstractFactory {
    Product make();
}
