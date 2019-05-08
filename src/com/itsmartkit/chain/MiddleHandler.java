package com.itsmartkit.chain;

/**
 * 中级处理者
 */
public class MiddleHandler extends Handler {
    @Override
    public void handleRequest(int type) {
        if (type == 2) {
            System.out.println(this.getClass().getName() + " handling...");
        } else {
            if (successor != null) {
                successor.handleRequest(type);
            } else {
                System.out.println("Cannot handle!");
            }
        }
    }
}
