package com.itsmartkit.strategy;

/**
 * 步行策略
 */
public class WalkStrategy implements Strategy {
    @Override
    public void execute() {
        System.out.println("walking...");
    }
}
