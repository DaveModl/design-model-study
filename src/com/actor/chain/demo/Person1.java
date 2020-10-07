package com.actor.chain.demo;

public class Person1 extends Handler {
    @Override
    public void handleReq(String req) {
        if ("one".equals(req)){
            System.out.println("[one]:process req...");
        }else {
            //下一位责任人
            if (getNext()!= null){
                getNext().handleReq(req);
            }else {
                System.out.println("[one]:没有合适的人选处理请求");
            }
        }
    }
}
