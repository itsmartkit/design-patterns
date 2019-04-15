package com.itsmartkit.factory;

/**
 * 抽象小汽车
 */
public abstract class Car {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void drive();
}
