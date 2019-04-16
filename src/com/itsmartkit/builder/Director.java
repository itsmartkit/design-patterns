package com.itsmartkit.builder;

/**
 * 指挥者
 */
public class Director {
    private ComputerBuilder computerBuilder;

    public Director(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public Computer constructComputer() {
        // 1.主板
        computerBuilder.buildMotherboard();
        // 2.cpu
        computerBuilder.buildCpu();
        // 3.硬盘
        computerBuilder.buildDisk();
        // 4.内存
        computerBuilder.buildMemory();
        // 5.显示屏
        computerBuilder.buildScreen();

        return computerBuilder.getComputer();
    }
}
