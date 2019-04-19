package com.itsmartkit.proxy.jdkproxy;

import com.itsmartkit.proxy.UserDao;
import com.itsmartkit.proxy.UserDaoImpl;

import java.lang.reflect.Proxy;

/**
 *测试类
 */
public class Test {
    public static void main(String[] args) {
        // 目标对象
        UserDao userDao = new UserDaoImpl();
        // 处理器
        ProxyHandler handler = new ProxyHandler(userDao);
        // 代理对象
        UserDao proxy = (UserDao) Proxy.newProxyInstance(UserDaoImpl.class.getClassLoader(),UserDaoImpl.class.getInterfaces(),handler);
        // 执行方法
        proxy.save();
    }
}
