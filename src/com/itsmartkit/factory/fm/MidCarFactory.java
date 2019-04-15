package com.itsmartkit.factory.fm;

import com.itsmartkit.factory.Car;
import com.itsmartkit.factory.MidCar;

/**
 * 中档小汽车工厂
 */
public class MidCarFactory extends AbstractFactory {
    @Override
    public Car create() {
        return new MidCar();
    }
}
