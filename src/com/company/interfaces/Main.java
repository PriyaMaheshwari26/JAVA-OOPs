package com.company.interfaces;

public class Main {
    public static void main(String[] args) {
//        Engine car=new Car();
////        car.a;  //-can not access because it is of engine type object
//        car.acc();
////        car.brake();
//        car.start();
//        car.stop();
//
//        Media media=new Car();
//        media.stop();
        NiceCar niceCar=new NiceCar();
        niceCar.start();
        niceCar.startMusic();
    }
}
