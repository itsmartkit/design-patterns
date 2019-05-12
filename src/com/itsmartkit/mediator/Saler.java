package com.itsmartkit.mediator;

/**
 * 具体同事类，房主
 */
public class Saler extends Colleague {

    public Saler(String name, Mediator mediator) {
        super(name, mediator);
    }

    @Override
    public void getMessage(String msg) {
        System.out.println("房主 [" + name + "] 获得消息：" + msg);
    }
}
