package com.lisheng.designpattern.prototype.shape;

/**
 * Created by lisheng on 2018/1/24.
 */
public class Square extends Shape {

    public Square(){
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
