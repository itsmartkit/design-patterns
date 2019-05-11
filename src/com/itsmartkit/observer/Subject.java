package com.itsmartkit.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象主题
 */
public abstract class Subject {

    protected List<Observer> observerList = new ArrayList<>();

    /**
     * 添加观察者
     * @param observer
     */
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    /**
     * 删除观察者
     * @param observer
     */
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    /**
     * 通知所有观察者
     */
    public abstract void notifyObservers();
}
