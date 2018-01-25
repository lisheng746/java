package com.lisheng.dp.prototype.shape;

/**
 * Created by lisheng on 2018/1/24.
 */
public class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
