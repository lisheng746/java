package com.lisheng.dp.builder.impl;

import com.lisheng.dp.builder.intf.Packing;

/**
 * Created by lisheng on 2018/1/24.
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
