package com.itsmartkit.prototype.constructor;

import com.itsmartkit.prototype.Student;

/**
 * 利用构造函数方法复制
 */
public class Student2 extends Student {
    private Address2 address;
    public Student2(String name, int age, Address2 address) {
        super(name, age, null);
        this.address = address;
    }

    /**
     * 深复制
     * @param stu
     */
    public Student2(Student2 stu) {
        super.setName(stu.getName());
        super.setAge(stu.getAge());
        address = new Address2(stu.getAddress());
    }

    @Override
    public Address2 getAddress() {
        return address;
    }

    public void setAddress(Address2 address) {
        super.setAddress(address);
    }
}
