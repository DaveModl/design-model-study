package com.actor.order.demo;

/**
 * 调用者
 */
public class Invoke {
    private Command command;

    public Invoke(Command command) {
        this.command = command;
    }

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void request(){
        System.out.println("order调用");
        command.order();
    }
}
