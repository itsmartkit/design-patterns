package com.itsmartkit.adapter.classadapter;

import com.itsmartkit.adapter.DC5;

/**
 * 测试类
 */
public class Test {
    public static void main(String[] args) {
        DC5 dc5 = new PowerAdapter();
        System.out.println(dc5.outputDC5V());
    }
}
