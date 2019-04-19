package com.itsmartkit.proxy.staticproxy;

import com.itsmartkit.proxy.UserDao;

/**
 * 代理对象
 */
public class UserDaoProxy implements UserDao {

    private UserDao userDao;

    public UserDaoProxy(final UserDao userDao) {
        this.userDao = userDao;
    }
    @Override
    public void save() {
        System.out.println("开始事务...");
        userDao.save();
        System.out.println("提交事务...");
    }
}
