package com.itsmartkit.strategy;

/**
 * 驾车策略
 */
public class DriveStrategy implements Strategy {
    @Override
    public void execute() {
        System.out.println("driving...");
    }
}
