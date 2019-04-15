package com.itsmartkit.singleton;

/**
 * 懒汉式，线程不安全
 */
public class Singleton2 {
    // 私有化构造
    private Singleton2() {}
    // 声明
    private static Singleton2 single = null;
    // 对外提供获取实例方法
    public static Singleton2 getInstance() {
        if (single == null) {
            single = new Singleton2();
        }
        return single;
    }
}
