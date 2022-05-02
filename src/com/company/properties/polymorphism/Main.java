package com.company.properties.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shapes=new Shapes();
        Circle circle=new Circle();
        Triangle triangle=new Triangle();
        Shapes cl= new Circle();
        cl.area();
        shapes.area();
        triangle.area();
    }
}
