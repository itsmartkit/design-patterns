package com.itsmartkit.templatemethod;

/**
 * 飞机票预订
 */
public class AirplaneTicketBooking extends AbstractTicketBooking {

    @Override
    public void order() {
        System.out.println("预订飞机票");
    }

    @Override
    public void pay() {
        System.out.println("使用信用卡支付");
    }
}
