package com.company.properties.inheritence;

public class Main {
    public static void main(String[] args) {
//        Box box=new Box();
//        System.out.println(box.l+" "+box.h+" "+ box.w);
//        Box box1=new Box(4);
//        System.out.println(box1.l+" "+box1.h+" "+ box1.w);
//        Box box2=new Box(box);
//        System.out.println(box2.l+" "+box2.h+" "+ box2.w);
        BoXWeight boXWeight=new BoXWeight();
        System.out.println(boXWeight.h+" "+boXWeight.weight);

        Box box=new BoXWeight(2,3,4,8);
//        System.out.println(box.wight);//---show error

//        BoXWeight box2=new BoX(2,3,4,);  //Error

//        BoXWeight(double l, double h, double w, double weight)
        BoXWeight box1=new BoXWeight(2,4,5,6);
        System.out.println(box1.h);

        RectangleBox b1=new RectangleBox(7,4.5);
        b1.h=9;
        System.out.println(b1.h);
    }
}
