package com.actor.state.demo;

public class StateB extends State {
    @Override
    public void stateChange(StateSwitch stateSwitch) {
        System.out.println("当前状态是B");
        stateSwitch.setState(new StateA());
    }
}
