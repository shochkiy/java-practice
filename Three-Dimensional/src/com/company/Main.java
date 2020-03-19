package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        Ball ball = new Ball(1);
        Cylinder cylinder = new Cylinder(3, 10);
        Pyramid pyramid = new Pyramid(10, 10.5);

        Box box = new Box(500);

        System.out.println(box.add(ball));
        System.out.println(box.add(cylinder));
        System.out.println(box.add(pyramid));

        ArrayList<Shape> shapes = box.getShapes();
        Collections.sort(shapes);

        for (int i = 0; i < shapes.size(); i++) {
            System.out.println(shapes.get(i).toString());
        }

        Shape shape = new SolidRevoForFunction(new Function<Double, Double>() {
            @Override
            public Double apply(Double aDouble) {
                return Math.cos(aDouble);
            }
        }, 5, 10);
        System.out.println(shape.getVolume());
    }
}
