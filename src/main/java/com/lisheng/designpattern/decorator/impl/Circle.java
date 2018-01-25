package com.lisheng.designpattern.decorator.impl;

import com.lisheng.designpattern.decorator.intf.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
