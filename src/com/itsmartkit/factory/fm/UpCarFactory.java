package com.itsmartkit.factory.fm;

import com.itsmartkit.factory.Car;
import com.itsmartkit.factory.UpCar;

/**
 * 高档小汽车工厂
 */
public class UpCarFactory extends AbstractFactory {

    @Override
    public Car create() {
        return new UpCar();
    }
}
