package com.lkp.demo;

/**
 * 迪米特法则，两个软件如果彼此没有联系应该通过第三方监理联系调用
 */
public class MainAccess {
    public static void main(String[] args) {
        Agent agent = new Agent();
        agent.setStar(new Stars("JAY"));
        agent.setFans(new Fans("Fans group"));
        agent.setCompany(new Company("ABC"));
        agent.fansMeeting();
        agent.work();
    }
}
