package com.itsmartkit.facade;

/**
 * 外观类（门面类）
 */
public class Computer {
    private Cpu cpu;

    private Disk disk;

    private Memory memory;

    public Computer() {
        cpu = new Cpu();
        disk = new Disk();
        memory = new Memory();
    }

    public void startup() {
        System.out.println("Computer startup begin...");
        cpu.startup();
        disk.startup();
        memory.startup();
        System.out.println("Computer startup end!");
    }

    public void shutdown() {
        System.out.println("Computer shutdown begin...");
        cpu.shutdown();
        disk.shutdown();
        memory.shutdown();
        System.out.println("Computer shutdown end!");
    }
}
