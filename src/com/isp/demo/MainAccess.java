package com.isp.demo;

/**
 * 接口隔离：类的接口应该建立在最小依赖之上
 */
public class MainAccess {
    public static void main(String[] args) {
        InputModule inputModule = StudentManager.input();
        CountModule countModule = StudentManager.count();
        PrintModule printModule = StudentManager.print();
        inputModule.insert();
        countModule.countScore();
        countModule.calAverage();
        printModule.queryInfo();
        printModule.printInfo();
    }
}
