package com.itsmartkit.state;

/**
 * 具体状态类，就绪状态
 */
public class Runnable extends ThreadState {
    public Runnable() {
        stateName = "就绪状态";
        showState();
    }

    public void getCPU(ThreadContext context) {
        System.out.print("获得CPU时间-->");
        if(stateName.equals("就绪状态")) {
            context.setState(new Running());
        } else {
            System.out.println("当前线程不是就绪状态，不能获取CPU！");
        }
    }
}
