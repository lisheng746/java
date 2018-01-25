package com.lisheng.dp.builder.item;

import com.lisheng.dp.builder.impl.Burger;

/**
 * Created by lisheng on 2018/1/24.
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
