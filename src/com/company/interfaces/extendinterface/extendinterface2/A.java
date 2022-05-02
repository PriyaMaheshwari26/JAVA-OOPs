package com.company.interfaces.extendinterface.extendinterface2;

public interface A {
//    static void  greeting();  //Not allowed as static method can not be overridden
    //call via the interface name
    static void greeting(){
        System.out.println("I'm static");
    }
    default void fun() {
        System.out.println("I am in A");
    }
}
