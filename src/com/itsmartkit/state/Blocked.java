package com.itsmartkit.state;

/**
 * 具体状态类，阻塞状态
 */
public class Blocked extends ThreadState {
    public Blocked() {
        stateName = "阻塞状态";
        showState();
    }

    public void resume(ThreadContext context) {
        System.out.print("调用resume()方法-->");
        if(stateName.equals("阻塞状态")) {
            context.setState(new Runnable());
        } else {
            System.out.println("当前线程不是阻塞状态，不能调用resume()方法！");
        }
    }
}
