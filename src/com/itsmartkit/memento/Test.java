package com.itsmartkit.memento;

/**
 * 测试类
 */
public class Test {
    private static int index = -1;
    private static MementoCaretaker caretaker = new MementoCaretaker();
    public static void main(String[] args) {
        Chessman chessman = new Chessman("车",1,1);
        play(chessman);
        chessman.setY(2);
        play(chessman);
        chessman.setX(2);
        play(chessman);
        chessman.setY(10);
        play(chessman);
        undo(chessman);
        redo(chessman);
    }

    private static void play(Chessman chessman) {
        System.out.println(chessman);
        caretaker.addMemento(chessman.saveState());
        index++;
    }

    private static void undo(Chessman chessman) {
        System.out.println("------------悔棋------------");
        ChessmanMemento memento = caretaker.getMemento(index - 1);
        chessman.setX(memento.getX());
        chessman.setY(memento.getY());
        index--;
        System.out.println(chessman);
    }

    private static void redo(Chessman chessman) {
        System.out.println("------------撤销悔棋------------");
        ChessmanMemento memento = caretaker.getMemento(index + 1);
        chessman.setX(memento.getX());
        chessman.setY(memento.getY());
        index++;
        System.out.println(chessman);
    }
}
