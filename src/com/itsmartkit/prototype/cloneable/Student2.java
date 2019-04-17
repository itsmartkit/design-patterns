package com.itsmartkit.prototype.cloneable;

import com.itsmartkit.prototype.Student;

/**
 * 利用Cloneable接口方法复制
 */
public class Student2 extends Student implements Cloneable {
    private Address2 address;
    public Student2(String name, int age, Address2 address) {
        super(name, age, null);
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student2 s = (Student2) super.clone();
        s.address = (Address2) address.clone();
        return s;
    }

    @Override
    public Address2 getAddress() {
        return address;
    }
}
