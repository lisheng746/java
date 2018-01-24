package com.lisheng.designpattern.prototype.main;

import com.lisheng.designpattern.prototype.shape.Circle;
import com.lisheng.designpattern.prototype.shape.Rectangle;
import com.lisheng.designpattern.prototype.shape.Shape;
import com.lisheng.designpattern.prototype.shape.Square;

import java.util.Hashtable;

/**
 * Created by lisheng on 2018/1/24.
 */
public class ShapeCache {
    private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    // 对每种形状都运行数据库查询，并创建该形状
    // shapeMap.put(shapeKey, shape);
    // 例如，我们要添加三种形状
    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");

        Square square = new Square();
        square.setId("2");

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");

        shapeMap.put(circle.getId(),circle);
        shapeMap.put(square.getId(),square);
        shapeMap.put(rectangle.getId(),rectangle);
    }

}
