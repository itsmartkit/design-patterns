package com.itsmartkit.proxy.cglibproxy;

import com.itsmartkit.proxy.UserDao;
import com.itsmartkit.proxy.UserDaoImpl;

/**
 * 测试类
 */
public class Test {
    public static void main(String[] args) {
        // 目标对象
        UserDao userDao= new UserDaoImpl();
        // 代理对象
        UserDao proxy = (UserDao) new CglibProxy().getProxyInstance(userDao);
        // 执行方法
        proxy.save();
    }
}
