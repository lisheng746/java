package com.lisheng.designpattern.builder.impl;

import com.lisheng.designpattern.builder.intf.Item;
import com.lisheng.designpattern.builder.intf.Packing;

/**
 * Created by lisheng on 2018/1/24.
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
