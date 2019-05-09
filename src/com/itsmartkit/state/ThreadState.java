package com.itsmartkit.state;

/**
 * 抽象状态类
 */
public abstract class ThreadState {
    /**
     * 线程状态名
     */
    protected String stateName;


    public void showState(){
        System.out.println("当前线程处于：" + stateName);
    }
}
