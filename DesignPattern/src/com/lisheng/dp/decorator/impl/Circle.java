package com.lisheng.dp.decorator.impl;

import com.lisheng.dp.decorator.intf.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
