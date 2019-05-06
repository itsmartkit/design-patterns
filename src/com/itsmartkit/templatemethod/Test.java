package com.itsmartkit.templatemethod;

/**
 * 测试类
 */
public class Test {
    public static void main(String[] args) {
        TrainTicketBooking trainTicketBooking  = new TrainTicketBooking();
        trainTicketBooking.booking();
        System.out.println("*****************");
        AirplaneTicketBooking airplaneTicketBooking = new AirplaneTicketBooking();
        airplaneTicketBooking.booking();
    }
}
