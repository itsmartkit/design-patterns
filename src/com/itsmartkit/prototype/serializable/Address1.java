package com.itsmartkit.prototype.serializable;

import com.itsmartkit.prototype.Address;

import java.io.Serializable;

/**
 * 利用Serializable序列化接口方法
 */
public class Address1 extends Address implements Serializable {
    public Address1(String pro, String city, String zip) {
        super(pro, city, zip);
    }
}
