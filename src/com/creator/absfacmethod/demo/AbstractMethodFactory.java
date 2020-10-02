package com.creator.absfacmethod.demo;

import com.creator.factory.demo.Product;

public interface AbstractMethodFactory {
    Product make();
    OtherProd makeO();
}
