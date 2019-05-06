package com.itsmartkit.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 文件夹
 */
public class Directory extends Entry {

    private List<Entry> list = new ArrayList<>();

    public Directory(String name) {
        super(name);
    }

    @Override
    public void add(Entry entry) {
        list.add(entry);
    }

    @Override
    public void display(int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("--");
        }
        System.out.println(name);
        // 遍历下级
        for (Entry entry : list) {
            entry.display(depth + 1);
        }
    }
}
