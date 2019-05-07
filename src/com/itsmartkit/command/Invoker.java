package com.itsmartkit.command;

/**
 * 请求发送者
 */
public class Invoker {

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void execCommand() {
        command.execute();
    }
}
