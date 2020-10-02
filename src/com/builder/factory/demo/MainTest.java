package com.builder.factory.demo;

import static java.util.Objects.requireNonNull;

public class MainTest {
    public static void main(String[] args) {
       requireNonNull(SimpleFactory.Factory.make(1)).desc();
       requireNonNull(SimpleFactory.Factory.make(0)).desc();
    }
}
