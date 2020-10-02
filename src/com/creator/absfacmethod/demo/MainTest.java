package com.creator.absfacmethod.demo;

import com.creator.factory.demo.Product;

public class MainTest {
    public static void main(String[] args) {
        AbstractMethodFactory methodFactory;
        methodFactory = new Factory();
        Product a;
        OtherProd op;
        a = methodFactory.make();
        op = methodFactory.makeO();
        a.desc();
        op.desc();
    }
}
