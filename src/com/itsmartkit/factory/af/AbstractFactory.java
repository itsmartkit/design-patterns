package com.itsmartkit.factory.af;

import com.itsmartkit.factory.Bus;
import com.itsmartkit.factory.Car;

/**
 * 抽象工厂
 */
public abstract class AbstractFactory {

    public abstract Car createCar();

    public abstract Bus createBus();
}
