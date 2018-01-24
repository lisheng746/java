package com.lisheng.designpattern.builder.impl;

import com.lisheng.designpattern.builder.intf.Packing;

/**
 * Created by lisheng on 2018/1/24.
 */
public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper";
    }
}
