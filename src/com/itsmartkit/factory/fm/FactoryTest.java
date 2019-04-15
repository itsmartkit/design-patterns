package com.itsmartkit.factory.fm;

import com.itsmartkit.factory.Car;

/**
 * 工厂方法测试
 */
public class FactoryTest {
    public static void main(String[] args) {
        // 创建高档小汽车工厂
        AbstractFactory factory = new UpCarFactory();
        Car car = factory.create();
        car.setName("A8");
        car.drive();
    }
}
