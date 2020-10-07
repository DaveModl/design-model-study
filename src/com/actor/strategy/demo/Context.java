package com.actor.strategy.demo;

public class Context {
    private Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void method(){
        strategy.strategyMethod();
    }

    public static void main(String[] args) {
        Context context = new Context();
        Strategy strategyA = new A();
        context.setStrategy(strategyA);
        context.method();
        Strategy strategyB = new B();
        context.setStrategy(strategyB);
        context.method();
    }
}
