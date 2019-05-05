package com.itsmartkit.facade;

/**
 * 客户端，测试类
 */
public class Cilent {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.startup();
        System.out.println("*********************************");
        computer.shutdown();
    }
}
