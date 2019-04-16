package com.itsmartkit.builder;

/**
 * 抽象生成器
 */
public interface ComputerBuilder {

    public abstract void buildMotherboard();

    public abstract void buildScreen();

    public abstract void buildCpu();

    public abstract void buildMemory();

    public abstract void buildDisk();

    public abstract Computer getComputer();
}
