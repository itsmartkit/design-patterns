package com.itsmartkit.singleton;

/**
 * 懒汉式，双重锁，线程安全
 */
public class Singleton4 {
    // 私有化构造
    private Singleton4() {}
    // 声明
    private static Singleton4 single = null;
    // 对外提供获取实例方法
    public static Singleton4 getInstance() {
        if (single == null) {
            synchronized (Singleton4.class) {
                if(single == null) {
                    single = new Singleton4();
                }
            }
        }
        return single;
    }
}
