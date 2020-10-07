package com.actor.chain.demo;

/**
 * 抽象责任人
 */
public abstract class Handler {
    private Handler next;

    public Handler getNext() {
        return next;
    }

    public void setNext(Handler next) {
        this.next = next;
    }

    public abstract void handleReq(String req);
}
