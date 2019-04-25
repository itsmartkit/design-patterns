package com.itsmartkit.decorator;

/**
 * 测试类
 */
public class Test {
    public static void main(String[] args) {
        Logger logger = new JsonLogger(new ConsoleLogger());
        logger.info("System start runing...");
        logger.error("NullPointerException");
    }
}
