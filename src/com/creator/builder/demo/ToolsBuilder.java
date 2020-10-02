package com.creator.builder.demo;

public abstract class ToolsBuilder {
    protected Tools tools = new Tools();
    public abstract void builderPart$1();
    public abstract void builderPart$2();

    public Tools getTools() {
        return tools;
    }
}
