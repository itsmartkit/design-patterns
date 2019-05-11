package com.itsmartkit.observer;

/**
 * 抽象观察者接口
 */
public interface Observer {
    /**
     * 更新
     */
    void update(String msg);
}
