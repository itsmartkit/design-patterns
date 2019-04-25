package com.itsmartkit.decorator;

/**
 * 抽象组件（Component）角色
 */
public interface Logger {

    void log(String msg);

    void info(String msg);

    void debug(String msg);

    void error(String msg);
}
