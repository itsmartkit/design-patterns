package com.itsmartkit.adapter.classadapter;

import com.itsmartkit.adapter.AC220;
import com.itsmartkit.adapter.DC5;

/**
 * 类适配器
 */
public class PowerAdapter extends AC220 implements DC5 {

    /**
     * 模拟交流变直流
     * @param ac
     * @return
     */
    private int PWM(int ac) {
        int dc = ac;
        return dc;
    }

    @Override
    public int outputDC5V() {
        return PWM(super.outputAC220V()) / 44;
    }
}
