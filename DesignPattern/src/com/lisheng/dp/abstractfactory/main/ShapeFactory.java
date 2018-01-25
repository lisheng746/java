package com.lisheng.dp.abstractfactory.main;

import com.lisheng.dp.abstractfactory.intf.Color;
import com.lisheng.dp.factory.impl.Circle;
import com.lisheng.dp.factory.impl.Rectangle;
import com.lisheng.dp.factory.impl.Square;
import com.lisheng.dp.factory.intf.Shape;

/**
 * Created by lisheng on 2018/1/24.
 */
public class ShapeFactory extends AbstractFactory {
    @Override
    Color getColor(String color) {
        return null;
    }

    @Override
    Shape getShape(String shape) {
        if(shape == null){
            return null;
        }
        if(shape.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shape.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shape.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
