package com.lisheng.dp.decorator.impl;

import com.lisheng.dp.decorator.intf.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
