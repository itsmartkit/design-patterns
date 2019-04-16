package com.itsmartkit.builder;

/**
 * 产品类
 */
public class Computer {

    /**
     * 主板
     */
    private String motherboard;

    /**
     * 显示屏
     */
    private String screen;

    /**
     * 处理器
     */
    private String cpu;

    /**
     * 内存
     */
    private String memory;

    /**
     * 硬盘
     */
    private String disk;

    public String getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getDisk() {
        return disk;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "motherboard='" + motherboard + '\'' +
                ", screen='" + screen + '\'' +
                ", cpu='" + cpu + '\'' +
                ", memory='" + memory + '\'' +
                ", disk='" + disk + '\'' +
                '}';
    }
}
