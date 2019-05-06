package com.itsmartkit.flyweight;

import java.util.HashMap;
import java.util.Objects;

/**
 * 享元工厂角色
 */
public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap<>(8);

    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);
        if (Objects.isNull(circle)) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}
