package com.itsmartkit.prototype.cloneable;

import com.itsmartkit.prototype.Address;
import com.itsmartkit.prototype.Student;

/**
 * 利用Cloneable接口方法复制
 */
public class Student1 extends Student implements Cloneable {
    public Student1(String name, int age, Address address) {
        super(name, age, address);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
