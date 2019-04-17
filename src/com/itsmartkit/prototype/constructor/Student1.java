package com.itsmartkit.prototype.constructor;

import com.itsmartkit.prototype.Address;
import com.itsmartkit.prototype.Student;

/**
 * 利用构造函数方法复制
 */
public class Student1 extends Student {
    public Student1(String name, int age, Address address) {
        super(name, age, address);
    }

    /**
     * 浅复制
     * @param stu
     */
    public Student1(Student1 stu) {
        super.setName(stu.getName());
        super.setAge(stu.getAge());
        super.setAddress(stu.getAddress());
    }
}
