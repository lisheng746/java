package com.lisheng.dp.factory.impl;

import com.lisheng.dp.factory.intf.Shape;

/**
 * Created by lisheng on 2018/1/24.
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
