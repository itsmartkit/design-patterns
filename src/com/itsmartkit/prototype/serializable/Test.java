package com.itsmartkit.prototype.serializable;

/**
 * 测试类
 */
public class Test {
    public static void main(String[] args) {
        deepCopy();
    }

    /**
     * 深复制
     */
    public static void deepCopy() {
        Address1 address = new Address1("北京","北京","100000");
        Student1 s1 = new Student1("张三",18, address);
        Student1 s2 = null;
        try{
            s2 = (Student1) s1.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 内存地址不同
        System.out.println(s1);
        System.out.println(s2);

        // 籍贯信息不同
        System.out.println(s1.getAddress());
        System.out.println(s2.getAddress());
    }
}
