package com.itsmartkit.factory;

/**
 * 中档公共汽车
 */
public class MidBus extends Bus {
    @Override
    public void drive() {
        System.out.println(this.getClass().getName()+ "-" + super.getName() + " drive!");
    }
}
