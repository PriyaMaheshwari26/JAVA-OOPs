package com.company.properties.abstractClass;

public abstract class Parent {
    int age;

    public Parent(int age) {
        this.age=age;
        VALUE = 100;
    }
    final int VALUE;

    abstract void career();
    abstract void partner();

    /*abstract Parent(){

    }*/
    static void greeting(){
        System.out.println("Hello");
    }
    void normal(){
        System.out.println("Normal Method");
    }



}
