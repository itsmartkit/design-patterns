package com.itsmartkit.chain;

/**
 * 抽象处理者
 */
public abstract class Handler {

    /**
     * 责任链中下一对象的引用
     */
    protected Handler successor;

    public Handler getSuccessor() {
        return successor;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    /**
     * 处理请求方法
     */
    public abstract void handleRequest(int type);
}
