package com.itsmartkit.decorator;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 具体组件（ConcreteComponent）角色
 */
public class ConsoleLogger implements Logger {

    private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Override
    public void log(String msg) {
        System.out.println(format.format(new Date()) + " log: " + msg);
    }

    @Override
    public void info(String msg) {
        System.out.println(format.format(new Date()) + " info: " + msg);
    }

    @Override
    public void debug(String msg) {
        System.out.println(format.format(new Date()) + " debug: " + msg);
    }

    @Override
    public void error(String msg) {
        System.err.println(format.format(new Date()) + " error: " + msg);
    }
}
