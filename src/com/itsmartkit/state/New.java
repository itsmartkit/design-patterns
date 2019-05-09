package com.itsmartkit.state;

/**
 * 具体状态类，新建状态
 */
public class New extends ThreadState {

    public New() {
        stateName = "新建状态";
        showState();
    }

    public void start(ThreadContext context) {
        System.out.print("调用start()方法-->");
        if(stateName.equals("新建状态")) {
            context.setState(new Runnable());
        } else {
            System.out.println("当前线程不是新建状态，不能调用start()方法！");
        }
    }
}
