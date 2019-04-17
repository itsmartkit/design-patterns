package com.itsmartkit.prototype.constructor;

import com.itsmartkit.prototype.Address;

/**
 * 测试类
 */
public class Test {
    public static void main(String[] args) {

        shallowCopy();

        deepCopy();
    }

    /**
     * 浅复制
     */
    public static void shallowCopy() {
        Address address = new Address("北京","北京","100000");
        Student1 s1 = new Student1("张三",18, address);
        Student1 s2 = new Student1(s1);

        // 内存地址不同
        System.out.println(s1);
        System.out.println(s2);

        // 籍贯信息相同
        System.out.println(s1.getAddress());
        System.out.println(s2.getAddress());
    }

    /**
     * 深复制
     */
    public static void deepCopy() {
        Address2 address = new Address2("北京","北京","100000");
        Student2 s1 = new Student2("张三",18, address);
        Student2 s2 = new Student2(s1);

        // 内存地址不同
        System.out.println(s1);
        System.out.println(s2);

        // 籍贯信息不同
        System.out.println(s1.getAddress());
        System.out.println(s2.getAddress());
    }
}
