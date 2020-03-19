package com.company;

import java.util.ArrayList;

public class Box implements Shape {

    private double available;
    private ArrayList<Shape> shapes = new ArrayList<>();

    public Box(double available) {
        this.available = available;
    }

    public boolean add (Shape shape) {
        if (available >= shape.getVolume()) {
            shapes.add(shape);
            available -= shape.getVolume();
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double getVolume() {
        return this.available;
    }

    public ArrayList<Shape> getShapes() {
        return shapes;
    }
}
