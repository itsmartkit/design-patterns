package com.itsmartkit.adapter.interfaceadapter;

import com.itsmartkit.adapter.AC220;

/**
 * 测试类
 */
public class Test {
    public static void main(String[] args) {
        Power5VAdapter power5VAdapter = new Power5VAdapter(new AC220());
        System.out.println(power5VAdapter.output5V());
    }
}
