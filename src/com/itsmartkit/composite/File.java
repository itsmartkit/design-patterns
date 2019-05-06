package com.itsmartkit.composite;

/**
 * 文件类
 */
public class File extends Entry {

    public File(String name) {
        super(name);
    }

    @Override
    public void add(Entry entry) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void display(int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("--");
        }
        System.out.println(name);
    }
}
