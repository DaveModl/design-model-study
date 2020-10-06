package com.structure.composite.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * 树枝
 */
public class Composite implements Component {
    private List<Component> fakeTree = new ArrayList<>();
    @Override
    public void add(Component component) {
        fakeTree.add(component);
    }

    @Override
    public void remove(Component component) {
        fakeTree.remove(component);
    }

    @Override
    public Component getChild(int i) {
        return fakeTree.get(i);
    }

    @Override
    public void operation() {
        for (Object o : fakeTree){
            ((Component)o).operation();
        }
    }
}
