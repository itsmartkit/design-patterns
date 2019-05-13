package com.itsmartkit.memento;

/**
 * 发起人，象棋类
 */
public class Chessman {

    private String name;

    private int x;

    private int y;

    public Chessman(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    /**
     * 保存状态
     */
    public ChessmanMemento saveState() {
        return new ChessmanMemento(name, x, y);
    }

    /**
     * 恢复状态
     */
    public void recover(ChessmanMemento memento) {
        this.x = memento.getX();
        this.y = memento.getY();
    }

    @Override
    public String toString() {
        return "棋子[" + name + "]，当前位置：<" + x + "," + y + ">";
    }
}
