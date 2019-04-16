package com.itsmartkit.builder;

/**
 * Lenovo电脑生成器
 */
public class LenovoBuilder implements ComputerBuilder {

    private Computer computer;

    public LenovoBuilder(){
        computer = new Computer();
    }

    @Override
    public void buildMotherboard() {

        computer.setMotherboard("联想主板");
        System.out.println("装配--" + computer.getMotherboard());
    }

    @Override
    public void buildScreen() {

        computer.setScreen("三星液晶屏");
        System.out.println("装配--" + computer.getScreen());
    }

    @Override
    public void buildCpu() {

        computer.setCpu("i7处理器");
        System.out.println("装配--" + computer.getCpu());
    }

    @Override
    public void buildMemory() {

        computer.setMemory("金士顿16g内存");
        System.out.println("装配--" + computer.getMemory());
    }

    @Override
    public void buildDisk() {

        computer.setDisk("希捷512G固态硬盘");
        System.out.println("装配--" + computer.getDisk());
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
