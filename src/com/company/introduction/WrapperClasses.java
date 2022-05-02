package com.company.introduction;

public class WrapperClasses {
    public static void main(String[] args) {
        Integer a=9;
        Integer b=2;
        swap(a,b);  //Will not swap as Integer is a final class
        System.out.println(a+" "+b);
    }

    static void swap(Integer a, Integer b) {
        Integer temp=a;
        a=b;
        b=temp;
    }
}
