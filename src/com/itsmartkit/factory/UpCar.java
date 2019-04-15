package com.itsmartkit.factory;

import com.itsmartkit.factory.Car;

/**
 * 高档小汽车
 */
public class UpCar extends Car {
    @Override
    public void drive() {
        System.out.println(this.getClass().getName()+ "-" + super.getName() + " drive!");
    }
}
