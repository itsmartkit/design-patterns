package com.itsmartkit.prototype.constructor;

import com.itsmartkit.prototype.Address;

/**
 * 用于深复制
 */
public class Address2 extends Address {
    public Address2(String pro, String city, String zip) {
        super(pro, city, zip);
    }

    public Address2(Address2 addr) {
        super.setPro(addr.getPro());
        super.setCity(addr.getCity());
        super.setZip(addr.getZip());
    }
}
