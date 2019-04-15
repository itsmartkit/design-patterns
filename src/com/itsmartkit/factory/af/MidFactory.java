package com.itsmartkit.factory.af;

import com.itsmartkit.factory.Bus;
import com.itsmartkit.factory.Car;
import com.itsmartkit.factory.MidBus;
import com.itsmartkit.factory.MidCar;

/**
 * 中档工厂
 */
public class MidFactory extends AbstractFactory {
    // 生产中级小汽车
    @Override
    public Car createCar() {
        return new MidCar();
    }
    // 生产中级公共汽车
    @Override
    public Bus createBus() {
        return new MidBus();
    }
}
