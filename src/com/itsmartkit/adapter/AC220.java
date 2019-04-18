package com.itsmartkit.adapter;

/**
 * 适配者（Adaptee）类，交流电220V
 */
public class AC220 {

    private int ac220 = 220;

    /**
     * 输出交流220V
     * @return
     */
    public int outputAC220V() {
        return ac220;
    }
}
