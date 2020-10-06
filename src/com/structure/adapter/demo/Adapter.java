package com.structure.adapter.demo;

/**
 * 适配器
 */
public class Adapter extends Adaptor implements Target {
    @Override
    public void request() {
        adapterAction();
    }

    public static void main(String[] args) {
        Target target = new Adapter();
        target.request();
    }
}
