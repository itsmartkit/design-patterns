package com.itsmartkit.builder;

/**
 * 消费者（测试类）
 */
public class ComputerCustomer {
    public static void main(String[] args) {

        LenovoBuilder lenovoBuilder = new LenovoBuilder();

        Director director = new Director(lenovoBuilder);

        Computer computer = director.constructComputer();

        System.out.println(computer);
    }
}
