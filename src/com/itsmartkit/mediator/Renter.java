package com.itsmartkit.mediator;

/**
 * 具体同事类，租房者
 */
public class Renter extends Colleague {

    public Renter(String name, Mediator mediator) {
        super(name, mediator);
    }

    @Override
    public void getMessage(String msg) {
        System.out.println("租客 [" + name + "] 获得消息：" + msg);
    }
}
