package com.itsmartkit.factory.af;

import com.itsmartkit.factory.Bus;
import com.itsmartkit.factory.Car;
import com.itsmartkit.factory.UpBus;
import com.itsmartkit.factory.UpCar;

/**
 * 高档工厂
 */
public class UpFactory extends AbstractFactory {
    // 生产高级小汽车
    @Override
    public Car createCar() {
        return new UpCar();
    }

    // 生产高级公共汽车
    @Override
    public Bus createBus() {
        return new UpBus();
    }
}
