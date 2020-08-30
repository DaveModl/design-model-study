package com.isp.demo;


public class StudentManager implements InputModule, CountModule, PrintModule {
    public StudentManager() {
    }

    @Override
    public void countScore() {
        System.out.println("count");
    }

    @Override
    public void calAverage() {
        System.out.println("average");
    }

    @Override
    public void insert() {
        System.out.println("insert");
    }

    @Override
    public void delete() {
        System.out.println("delete");
    }

    @Override
    public void modify() {
        System.out.println("modify");
    }

    @Override
    public void printInfo() {
        System.out.println("print");
    }

    @Override
    public void queryInfo() {
        System.out.println("query");
    }

    public static InputModule input(){
        return new StudentManager();
    }

    public static PrintModule print(){
        return new StudentManager();
    }

    public static CountModule count(){
        return new StudentManager();
    }
}
