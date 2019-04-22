package com.itsmartkit.bridge;

/**
 * 平信邮寄，具体实现化角色
 */
public class SimplePost implements Post {
    @Override
    public void post() {
        System.out.println("平信邮寄");
    }
}
