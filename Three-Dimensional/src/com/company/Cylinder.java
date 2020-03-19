package com.company;

public class Cylinder extends SolidOfRevolution {

    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    @Override
    public double getVolume() {
        return Math.PI*radius*radius*height;
    }

    @Override
    public String toString() {
        return "cylinder";
    }
}
