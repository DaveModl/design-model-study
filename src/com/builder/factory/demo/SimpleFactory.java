package com.builder.factory.demo;

public class SimpleFactory {
    private static final int PRODUCT_A = 0;
    private static final int PRODUCT_B = 1;

    public static class Factory{
        /**
         * 静态类，一个工厂生产多个商品,添加商品时需要修改代码，违背开闭原则
         * @param kinds
         * @return
         */
        public static Product make(int kinds){
            switch (kinds){
                case 0:
                    return new ProductA();
                case 1:
                    return new ProductB();
            }
            return null;
        }
    }
}
