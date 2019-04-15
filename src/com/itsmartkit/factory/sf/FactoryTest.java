package com.itsmartkit.factory.sf;

import com.itsmartkit.factory.Car;
import com.itsmartkit.factory.sf.CarSimpleFactory;

/**
 * 简单工厂测试类
 */
public class FactoryTest {
    public static void main(String[] args) {
        // 高档小汽车
        Car upCar = CarSimpleFactory.create("UpCar");
        upCar.setName("A8");
        upCar.drive();
        // 中档小汽车
        Car midCar = CarSimpleFactory.create("MidCar");
        midCar.setName("A4");
        midCar.drive();
    }
}
