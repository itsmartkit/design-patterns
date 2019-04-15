package com.itsmartkit.factory;

/**
 * 抽象公共汽车
 */
public abstract class Bus {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void drive();
}
