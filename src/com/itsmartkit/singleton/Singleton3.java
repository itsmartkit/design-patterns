package com.itsmartkit.singleton;

/**
 * 懒汉式，线程安全
 */
public class Singleton3 {
    // 私有化构造
    private Singleton3() {}
    // 声明
    private static Singleton3 single = null;
    // 对外提供获取实例方法，加锁
    public static synchronized Singleton3 getInstance() {
        if (single == null) {
            single = new Singleton3();
        }
        return single;
    }
}

