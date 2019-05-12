package com.itsmartkit.iterator;

import java.util.ArrayList;

/**
 * 具体聚合类
 */
public class ConcreteAggregate implements List {

    private java.util.List<Object> list = new ArrayList();

    private int index = 0;

    @Override
    public void add(Object object) {
        list.add(object);
    }

    @Override
    public Object get(int index) {
        return list.get(index);
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public Iterator iterator() {
        return new ConcreteIterator();
    }

    /**
     * 具体迭代器
     */
    private class ConcreteIterator implements Iterator{

        @Override
        public boolean hasNext() {
            return index < size();
        }

        @Override
        public Object next() {
            Object object = get(index);
            index++;
            return object;
        }
    }

}
