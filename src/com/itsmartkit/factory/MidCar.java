package com.itsmartkit.factory;

import com.itsmartkit.factory.Car;

/**
 * 中档小汽车
 */
public class MidCar extends Car {
    @Override
    public void drive() {
        System.out.println(this.getClass().getName()+ "-" + super.getName() + " drive!");
    }
}
