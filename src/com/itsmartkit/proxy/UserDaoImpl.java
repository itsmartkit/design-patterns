package com.itsmartkit.proxy;

/**
 * 目标对象
 */
public class UserDaoImpl implements UserDao {

    @Override
    public void save() {
        System.out.println("保存数据");
    }
}
