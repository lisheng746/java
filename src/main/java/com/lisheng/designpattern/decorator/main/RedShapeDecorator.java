package com.lisheng.designpattern.decorator.main;

import com.lisheng.designpattern.decorator.impl.ShapeDecorator;
import com.lisheng.designpattern.decorator.intf.Shape;

public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }
}
