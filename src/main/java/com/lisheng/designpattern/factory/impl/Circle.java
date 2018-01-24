package com.lisheng.designpattern.factory.impl;

import com.lisheng.designpattern.factory.intf.Shape;

/**
 * Created by lisheng on 2018/1/24.
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
