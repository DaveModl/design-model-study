package com.actor.memento.demo;

public class Origin {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento createMemento(){
        return new Memento(state);
    }

    public void reset(Memento memento){
        this.setState(memento.getState());
    }

    @Override
    public String toString() {
        return "Origin{" +
                "state='" + state + '\'' +
                '}';
    }
}
