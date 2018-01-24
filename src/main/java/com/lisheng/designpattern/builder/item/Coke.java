package com.lisheng.designpattern.builder.item;

import com.lisheng.designpattern.builder.impl.ColdDrink;

/**
 * Created by lisheng on 2018/1/24.
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
