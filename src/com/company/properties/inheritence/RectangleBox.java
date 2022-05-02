package com.company.properties.inheritence;
//Multilevel Inheritance
public class RectangleBox extends BoXWeight {
    double side;

    public RectangleBox(double l, double h, double w, double weight, double side) {
        super(l, h, w, weight);
        this.side = side;
    }

    public RectangleBox(double weight, double side) {
        super(weight);
        this.side = side;
    }
}
