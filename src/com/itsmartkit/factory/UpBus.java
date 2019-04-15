package com.itsmartkit.factory;

/**
 * 高档公共汽车
 */
public class UpBus extends Bus{
    @Override
    public void drive() {
        System.out.println(this.getClass().getName()+ "-" + super.getName() + " drive!");
    }
}
