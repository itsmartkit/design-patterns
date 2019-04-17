package com.itsmartkit.prototype.cloneable;

import com.itsmartkit.prototype.Address;

/**
 * 用于深复制
 */
public class Address2 extends Address implements Cloneable {
    public Address2(String pro, String city, String zip) {
        super(pro, city, zip);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
