package com.lisheng.dp.builder.item;

import com.lisheng.dp.builder.impl.ColdDrink;

/**
 * Created by lisheng on 2018/1/24.
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
