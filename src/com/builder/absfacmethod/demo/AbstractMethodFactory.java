package com.builder.absfacmethod.demo;

import com.builder.factory.demo.Product;

public interface AbstractMethodFactory {
    Product make();
    OtherProd makeO();
}
