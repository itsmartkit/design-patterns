package com.itsmartkit.templatemethod;

/**
 * 车票预订，抽象类
 */
public abstract class AbstractTicketBooking {
    /**
     * 模板方法
     */
    public final void booking() {
        userLogin();
        query();
        order();
        if (isConfirm()) {
            confirm();
        }
        pay();
    }

    /**
     * 登录，子类不能重写的方法
     */
    public final void userLogin() {
        System.out.println("用户登录");
    }

    /**
     * 余票查询，子类可以重写的方法
     */
    public void query() {
        System.out.println("余票查询");
    }

    /**
     * 订票，子类必须实现的方法
     */
    public abstract void order();

    /**
     * 确认订单信息
     */
    public void confirm() {
        System.out.println("确认订单信息");
    }

    public void pay() {
        System.out.println("使用支付宝支付");
    }

    /**
     * 是否需要确认订单信息，钩子方法
     */
    protected boolean isConfirm() {
        return true;
    }
}
