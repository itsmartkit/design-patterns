package com.itsmartkit.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * 备忘录管理者
 */
public class MementoCaretaker {

    private List<ChessmanMemento> mementoList = new ArrayList<>();

    /**
     * 添加备忘录
     */
    public void addMemento(ChessmanMemento memento) {
        mementoList.add(memento);
    }

    /**
     * 获取备忘录
     */
    public ChessmanMemento getMemento(int index) {
        return mementoList.get(index);
    }
}
