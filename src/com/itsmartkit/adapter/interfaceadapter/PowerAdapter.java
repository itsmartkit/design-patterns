package com.itsmartkit.adapter.interfaceadapter;

import com.itsmartkit.adapter.AC220;

/**
 * 电源适配器
 */
public abstract class PowerAdapter implements DCOutput {
    protected AC220 pAC220;

    public PowerAdapter(AC220 ac220) {
        this.pAC220 = ac220;
    }

    @Override
    public int output5V() {
        return 0;
    }

    @Override
    public int output9V() {
        return 0;
    }

    @Override
    public int output12V() {
        return 0;
    }

    @Override
    public int output24V() {
        return 0;
    }
}
