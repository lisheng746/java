package com.lisheng.designpattern.factory;

import com.lisheng.designpattern.factory.impl.Circle;
import com.lisheng.designpattern.factory.impl.Rectangle;
import com.lisheng.designpattern.factory.impl.Square;
import com.lisheng.designpattern.factory.intf.Shape;

/**
 * Created by lisheng on 2018/1/24.
 */
public class ShapeFactory {
    //使用 getShape 方法获取形状类型的对象
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }

    public static Object getClass(Class<? extends Shape> clazz){
        Object obj = null;

        try{
            obj = Class.forName(clazz.getName());
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }

        return obj;
    }
}
