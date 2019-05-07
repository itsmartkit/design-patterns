package com.itsmartkit.strategy;

/**
 * 客户端，测试类
 */
public class Test {
    public static void main(String[] args) {
        Context context = new Context(new DriveStrategy());
        context.execute();
        System.out.println("*****************");
        context = new Context(new WalkStrategy());
        context.execute();
    }
}
