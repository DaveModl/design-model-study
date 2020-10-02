package com.creator.builder.demo;

/**
 * 指挥
 */
public class Director {
    private ToolsBuilder builder;

    public Director(ToolsBuilder builder) {
        this.builder = builder;
    }

    public Tools toolsBuild(){
        builder.builderPart$1();
        builder.builderPart$2();
        return builder.getTools();
    }
}
