package com.structure.composite.demo;

/**
 * 组合模式:二叉树,组合的抽象结果
 */
public interface Component {
    void add(Component component);
    void remove(Component component);
    Component getChild(int i);
    void operation();
}
