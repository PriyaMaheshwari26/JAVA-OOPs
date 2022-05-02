package com.company.cloning;

public class Human implements Cloneable{
    int age;
    String name;
    int[] arr;
    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr=new int[]{3,4,6,9};
    }

//    public Human(Human other){
//        this.age=other.age;
//        this.name=other.name;
//    }

//    public Object clone() throws CloneNotSupportedException{
    //shallow copy
//        return super.clone();
//    }
public Object clone() throws CloneNotSupportedException{
        Human twin=(Human) super.clone();//shallow copy
    //Make a Deep Copy
    twin.arr=new int[twin.arr.length];
    for (int i = 0; i <twin.arr.length ; i++) {
        twin.arr[i]=this.arr[i];

    }
    return twin;
}
}
