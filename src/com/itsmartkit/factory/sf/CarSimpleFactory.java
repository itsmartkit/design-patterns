package com.itsmartkit.factory.sf;

import com.itsmartkit.factory.Car;
import com.itsmartkit.factory.MidCar;
import com.itsmartkit.factory.UpCar;

/**
 * 简单工厂
 */
public class CarSimpleFactory {

    private final static String UP = "UpCar";

    private final static String MID = "MidCar";

    public static Car create(String type) {
        if (type.equals(UP)) {
            return new UpCar();
        }
        if (type.equals(MID)) {
            return new MidCar();
        }
        return null;
    }
}
