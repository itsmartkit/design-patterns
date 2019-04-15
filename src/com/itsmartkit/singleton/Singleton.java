package com.itsmartkit.singleton;

/**
 * 饿汉式，线程安全
 */
public class Singleton {
    // 私有化构造
    private Singleton() {}
    // 创建实例
    private final static Singleton single = new Singleton();
    // 对外提供获取实例方法
    public static Singleton getInstance() {
        return single;
    }
}
