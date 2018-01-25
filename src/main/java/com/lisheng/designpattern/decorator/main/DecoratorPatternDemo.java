package com.lisheng.designpattern.decorator.main;

import com.lisheng.designpattern.decorator.impl.Circle;
import com.lisheng.designpattern.decorator.impl.Rectangle;
import com.lisheng.designpattern.decorator.intf.Shape;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
