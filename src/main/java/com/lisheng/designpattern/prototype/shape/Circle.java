package com.lisheng.designpattern.prototype.shape;

/**
 * Created by lisheng on 2018/1/24.
 */
public class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
