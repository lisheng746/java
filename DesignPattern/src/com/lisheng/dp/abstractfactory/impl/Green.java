package com.lisheng.dp.abstractfactory.impl;

import com.lisheng.dp.abstractfactory.intf.Color;

/**
 * Created by lisheng on 2018/1/24.
 */
public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
