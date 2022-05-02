package com.company.properties.polymorphism.method_overloading;
//C
public class ByChangingArgumentType {
    public static void main(String[] args) {
        add(2,"6");
        add(2,7);
    }
    static void add(int a,int b){
        System.out.println(a+b);
    }
    static void add(int a,String b){
        System.out.println(a+b);
    }
}