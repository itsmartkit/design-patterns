package com.itsmartkit.adapter.objectadapter;

import com.itsmartkit.adapter.AC220;

/**
 * 对象适配器
 */
public class PowerAdapter {
    private AC220 ac220;

    public PowerAdapter(AC220 ac220) {
        this.ac220 = ac220;
    }

    /**
     * 模拟交流变直流
     * @param ac
     * @return
     */
    private int PWM(int ac) {
        int dc = ac;
        return dc;
    }

    public int outputDC5V() {
        if (null == ac220) {
            return 0;
        }
        return PWM(ac220.outputAC220V()) / 44;
    }
}
