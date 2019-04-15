package com.itsmartkit.singleton;

/**
 * 静态内部类，线程安全
 */
public class Singleton5 {
    // 静态内部类创建实例
    private static class SingletonHolder {
        private static final Singleton5 single = new Singleton5();
    }
    // 私有化构造
    private Singleton5() {}
    // 对外提供获取实例方法
    public static Singleton5 getInstance() {
        return SingletonHolder.single;
    }
}
