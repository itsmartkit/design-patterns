package com.itsmartkit.mediator;

/**
 * 抽象同事类
 */
public abstract class Colleague {

    protected String name;

    protected Mediator mediator;

    public Colleague(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public void constact(String msg) {
        mediator.constact(this, msg);
    }

    public abstract void getMessage(String msg);
}
