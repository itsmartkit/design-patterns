package com.itsmartkit.iterator;

/**
 * 测试类
 */
public class Test {
    public static void main(String[] args) {
        List list = new ConcreteAggregate();
        list.add("hello");
        list.add("world");
        list.add("java");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
