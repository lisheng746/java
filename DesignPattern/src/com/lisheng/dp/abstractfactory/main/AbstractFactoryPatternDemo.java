package com.lisheng.dp.abstractfactory.main;

import com.lisheng.dp.abstractfactory.intf.Color;
import com.lisheng.dp.factory.intf.Shape;

/**
 * Created by lisheng on 2018/1/24.
 */
public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        //获取形状工厂
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        Shape shape1 = shapeFactory.getShape("Circle");
        Shape shape2 = shapeFactory.getShape("Rectangle");
        Shape shape3 = shapeFactory.getShape("Square");

        shape1.draw();
        shape2.draw();
        shape3.draw();

        //获取颜色工厂
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        Color color1 = colorFactory.getColor("Red");
        Color color2 = colorFactory.getColor("Green");
        Color color3 = colorFactory.getColor("Blue");

        color1.fill();
        color2.fill();
        color3.fill();
    }
}
