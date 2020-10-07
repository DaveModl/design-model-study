package com.actor.state.demo;

public class StateSwitch {
    private State state;

    public StateSwitch() {
        this.state = new StateA();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        System.out.println("状态切换为"+state.getClass().getName());
        this.state = state;
    }

    public void switchMethod(){
        state.stateChange(this);
    }
}
