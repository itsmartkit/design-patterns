package com.itsmartkit.adapter.objectadapter;

import com.itsmartkit.adapter.AC220;
import com.itsmartkit.adapter.DC5;

/**
 * 测试类
 */
public class Test {
    public static void main(String[] args) {
        PowerAdapter dc5 = new PowerAdapter(new AC220());
        System.out.println(dc5.outputDC5V());
    }
}
