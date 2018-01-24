package com.lisheng.designpattern.builder.item;

import com.lisheng.designpattern.builder.impl.Burger;

/**
 * Created by lisheng on 2018/1/24.
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
