package com.itsmartkit.bridge;

/**
 * 挂号邮寄，具体实现化角色
 */
public class MarkPost implements Post {
    @Override
    public void post() {
        System.out.println("挂号邮寄");
    }
}
