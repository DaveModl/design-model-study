package com.actor.state.demo;

public class StateA extends State{
    @Override
    public void stateChange(StateSwitch stateSwitch) {
        System.out.println("当前状态是A");
        stateSwitch.setState(new StateB());
    }
}
