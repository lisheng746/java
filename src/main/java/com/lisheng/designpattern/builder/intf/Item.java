package com.lisheng.designpattern.builder.intf;

/**
 * Created by lisheng on 2018/1/24.
 */
public interface Item {
    String name();
    Packing packing();
    float price();
}
