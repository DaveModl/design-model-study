package com.actor.chain.demo;

public class Person2 extends Handler {
    @Override
    public void handleReq(String req) {
        if ("two".equals(req)){
            System.out.println("[two]:process req...");
        }else {
            //下一位责任人
            if (getNext()!= null){
                getNext().handleReq(req);
            }else {
                System.out.println("[two]:没有合适的人选处理请求");
            }
        }
    }
}
