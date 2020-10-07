package com.actor.iterator.demo;

public interface Aggregate {
    void add(Object obj);
    void remove(Object obj);
    Iterator getIterator();
}
