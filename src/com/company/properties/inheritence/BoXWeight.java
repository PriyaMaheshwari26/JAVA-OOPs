package com.company.properties.inheritence;

public class BoXWeight extends Box {
    double weight;

    public BoXWeight(double weight) {
        this.weight = weight;
    }

    public BoXWeight(double side, double weight) {
        super(side);
        this.weight = weight;
    }

    public BoXWeight(double l, double h, double w, double weight) {
        super(l, h, w);
        // call the parent class constructor
//        If we remove super from here it will call the defualt constructor of parent class
        this.weight = weight;
    }

    public BoXWeight(Box old, double weight) {
        super(old);
        this.weight = weight;
    }

    BoXWeight(){
        this.weight=-1;
    }
}
