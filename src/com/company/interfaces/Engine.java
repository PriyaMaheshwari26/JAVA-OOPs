package com.company.interfaces;

interface Engine {
    int a=9;
    static  final int PRICE=20000;
    void start();
    void stop();
    void acc();
    default void msg(){
        System.out.println("Default method is running");
    }
}
