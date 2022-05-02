package com.company.properties.polymorphism.method_overloading;

public class ByChangingReturnType {
    public static void main(String[] args) {
/*     In java, method overloading is not possible by changing the return type
      of the method only because of ambiguity. Let's see how ambiguity may occur:*/

        //Ambiguity
//        sum(2,6);
//        sum(2,8);
        sum(5,8);
        sum(30000l,900l);
    }
//    static int add(int a,int b){return a+b;}
//    static double add(int a,int b){return a+b;}



   static void sum(int a,long b){System.out.println("a method invoked");}
   static void sum(long a,int b){System.out.println("b method invoked");}

//No Ambiguity
    static void sum(int a,int b){System.out.println("int arg method invoked");}
    static void sum(long a,long b){System.out.println("long arg method invoked");}

}
