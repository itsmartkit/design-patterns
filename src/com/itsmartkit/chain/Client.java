package com.itsmartkit.chain;

/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        Handler handler = new PrimaryHandler();
        handler.setSuccessor(new MiddleHandler());
        handler.handleRequest(1);
        System.out.println("*****************");
        handler.handleRequest(2);
        System.out.println("*****************");
        handler.handleRequest(3);
    }
}