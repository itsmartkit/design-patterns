package com.itsmartkit.proxy.staticproxy;

import com.itsmartkit.proxy.UserDao;
import com.itsmartkit.proxy.UserDaoImpl;

/**
 * 测试类
 */
public class Test {
    public static void main(String[] args) {
        UserDao userDao = new UserDaoProxy(new UserDaoImpl());
        userDao.save();
    }
}
