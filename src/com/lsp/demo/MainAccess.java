package com.lsp.demo;

/**
 * 里氏原则，父类性质在子类中也成立，子类可以对父类进行扩展
 */
public class MainAccess {
    public static void main(String[] args) {
        Bird swallow = new Swallow();
        Bird kiwi = new Kiwi();
        swallow.setFlySpeed(50);
        kiwi.setFlySpeed(100);
        try{
            System.out.println(swallow.calTimeFly(100));
            System.out.println(kiwi.calTimeFly(100));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
