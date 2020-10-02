package com.creator.facmethod.demo;

import com.creator.factory.demo.Product;

/**
 * 只生产一类商品
 */
public interface AbstractFactory {
    Product make();
}
