package com.company.interfaces;

public class Car implements Engine, Brake,Media //Multiple Inheritance
 {
//     int a;
    @Override
    public void brake() {
        System.out.println("I brake like a normal car");
    }

    @Override
    public void start() {
        System.out.println("I Starts like a normal car");

    }
//     when overriding methods, the access modifier should be same o
//     r better i.e. if in Parent Class it was protected,  then overridden should be either protected or public.
     public void msg(){
        System.out.println("Hello world");
    }

    @Override
    public void stop() {
        System.out.println("I stops media like a normal car");

    }

    @Override
    public void acc() {
        System.out.println("I accelerate like a normal car");

    }

     public static void main(String[] args) {
         System.out.println(PRICE);
         System.out.println(a);
         Car car=new Car();
         car.stop();
         car.msg();
     }
}
