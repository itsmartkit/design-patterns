package com.itsmartkit.state;

/**
 * 具体状态类，死亡状态
 */
public class Dead extends ThreadState {
    public Dead() {
        stateName = "死亡状态";
        showState();
    }
}
