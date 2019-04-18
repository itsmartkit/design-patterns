package com.itsmartkit.adapter.interfaceadapter;

import com.itsmartkit.adapter.AC220;

/**
 * 5V电源适配器
 */
public class Power5VAdapter extends PowerAdapter {
    public Power5VAdapter(AC220 ac220) {
        super(ac220);
    }

    @Override
    public int output5V(){

        if (null != pAC220) {
            return pAC220.outputAC220V() / 44;
        }
        return 0;
    }

}
