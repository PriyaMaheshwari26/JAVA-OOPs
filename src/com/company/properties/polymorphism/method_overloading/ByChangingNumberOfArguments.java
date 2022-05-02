package com.company.properties.polymorphism.method_overloading;

public class ByChangingNumberOfArguments {
    public static void main(String[] args) {
        System.out.println(add(2,7));
        System.out.println(add(2,7,1));
    }
    static int add(int a,int b){
        return a+b;
    }
    static int add(int a,int b,int c){
        return a+b+c;
    }
}
