package com.itsmartkit.chain;

/**
 * 初级处理者
 */
public class PrimaryHandler extends Handler {
    @Override
    public void handleRequest(int type) {
        if (type == 1) {
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
