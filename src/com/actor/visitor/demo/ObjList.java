package com.actor.visitor.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ObjList {
    private List<Element> elements = new ArrayList<>();
    public void accept(Visitor visitor) {
        Iterator<Element> i= elements.iterator();
        while(i.hasNext()) {
            ((Element) i.next()).accept(visitor);
        }
    }
    public void add(Element element) {
        elements.add(element);
    }
    public void remove(Element element) {
        elements.remove(element);
    }
}
