package com.itsmartkit.command;

/**
 * 测试类
 */
public class Test {
    public static void main(String[] args) {
        // 接收者
        Light light = new Light();
        // 调用者
        Invoker invoker = new Invoker(new LightOnCommand(light));
        invoker.execCommand();
        System.out.println("*****************");
        invoker = new Invoker(new LightOffCommand(light));
        invoker.execCommand();
    }
}
