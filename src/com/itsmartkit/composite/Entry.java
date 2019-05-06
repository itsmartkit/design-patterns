package com.itsmartkit.composite;

/**
 * 目录条目类
 */
public abstract class Entry {

    protected String name;

    public Entry(String name) {
        this.name = name;
    }

    public abstract void add(Entry entry);

    public abstract void display(int depth);
}
