package com.actor.iterator.demo;

public class MainTest {
  public static void main(String[] args) {
    Aggregate aggregate = new ConcreteAggregate();
    aggregate.add("aaa");
    aggregate.add("bbb");
    aggregate.add("ccc");
    Iterator it = aggregate.getIterator();
    while (it.hasNext()) {
      Object ob = it.next();
      System.out.print(ob.toString() + "\t");
    }
    Object ob = it.first();
    System.out.println("\nFirst：" + ob.toString());
  }
}
