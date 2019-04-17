package com.itsmartkit.prototype.serializable;

import com.itsmartkit.prototype.Student;

import java.io.*;
/**
 * 利用Serializable序列化接口方法
 */
public class Student1 extends Student implements Serializable {
    private Address1 address;
    public Student1(String name, int age, Address1 address) {
        super(name, age, address);
        this.address = address;
    }

    @Override
    public Address1 getAddress() {
        return address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object obj = null;
        try {
            ByteArrayOutputStream bos =new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            obj = ois.readObject();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return obj;
    }
}
