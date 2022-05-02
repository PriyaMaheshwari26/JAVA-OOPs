package com.company.properties.polymorphism;

public class Numbers {
    int sum(int a,int b){
        return a+b;
    }
    //Error
//    void sum(int b,int a){
//        //return a+b;
//    }

    //--Ordering--> No error
    /*int sum(String  b,int a){
        return a+b;
    }*/
    void sum(int a,int b,int c){
        System.out.println(a+b+c);
    }

    public static void main(String[] args) {
        Numbers ob=new Numbers();
        ob.sum(2,4); 
        ob.sum(2,5,7);
    }

}
