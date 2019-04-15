package com.itsmartkit.factory.af;

import com.itsmartkit.factory.Bus;
import com.itsmartkit.factory.Car;

/**
 * 抽象工厂测试
 */
public class FactoryTest {
    public static void main(String[] args) {
        // 创建高档工厂
        AbstractFactory factory =new UpFactory();
        // 高档小汽车
        Car car = factory.createCar();
        car.setName("A8");
        car.drive();
        // 高档公共汽车
        Bus bus = factory.createBus();
        bus.setName("B8");
        bus.drive();
    }
}
