package com.itsmartkit.templatemethod;

/**
 * 火车票预订
 */
public class TrainTicketBooking extends AbstractTicketBooking {

    @Override
    public void order() {
        System.out.println("预订火车票");
    }

    /**
    * 重写钩子方法
    */
    @Override
    protected boolean isConfirm() {
        return false;
    }
}
