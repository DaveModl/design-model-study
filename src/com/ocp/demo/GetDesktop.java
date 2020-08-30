package com.ocp.demo;

/**
 * 开闭原则：不改变源码的情况下对类进行扩展
 */
public class GetDesktop {
    public static void main(String[] args) {
        AbsDeskTopDisplay black = new BlackDesktop();
        AbsDeskTopDisplay blue = new BlueDesktop();
        black.display();
        blue.display();
    }
}
