package com.itsmartkit.observer;

/**
 * 具体观察者，老师
 */
public class Teacher implements Observer{
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public void update(String msg) {
        System.out.println("[Teacher] " + name + " 收到推送消息--> " + msg);
    }
}
