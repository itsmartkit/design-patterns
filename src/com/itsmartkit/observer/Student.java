package com.itsmartkit.observer;

/**
 * 具体观察者，学生
 */
public class Student implements Observer {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void update(String msg) {
        System.out.println("[Student] " + name + " 收到推送消息--> " + msg);
    }
}
