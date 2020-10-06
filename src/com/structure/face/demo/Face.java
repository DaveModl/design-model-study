package com.structure.face.demo;

/**
 * 外观模式
 */
public class Face {
    private AFunc a = new AFunc();
    private BFunc b = new BFunc();

    public void action(){
        a.actionA();
        b.actionB();
    }

    public static void main(String[] args) {
        Face face = new Face();
        face.action();
    }
}
