package com.creator.builder.demo;

public class MainTest {
    public static void main(String[] args) {
        ToolsBuilder toolsBuilder = new Builder();
        Director director = new Director(toolsBuilder);
        System.out.println(director.toolsBuild().toString());
    }
}
