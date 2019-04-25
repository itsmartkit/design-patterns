package com.itsmartkit.decorator;

/**
 * 装饰者（Decorator）角色
 */
public abstract class Decorator implements Logger {

    protected Logger logger;

    public Decorator(Logger logger) {
        this.logger = logger;
    }

}
