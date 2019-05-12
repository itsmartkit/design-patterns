package com.itsmartkit.iterator;

/**
 * 抽象聚合
 */
public interface List {

    void add(Object object);

    Object get(int index);

    int size();

    Iterator iterator();
}
