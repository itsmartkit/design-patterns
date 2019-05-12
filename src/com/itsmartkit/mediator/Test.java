package com.itsmartkit.mediator;

/**
 * 测试类
 */
public class Test {
    public static void main(String[] args) {
        ZiroomMediator mediator = new ZiroomMediator();

        Renter renter = new Renter("张三", mediator);
        Saler saler = new Saler("李四", mediator);

        mediator.setRenter(renter);
        mediator.setSaler(saler);

        renter.constact("我想租一套两室一厅的房子你出租吗？");
        saler.constact("出租，你要看看房吗？");

    }
}
