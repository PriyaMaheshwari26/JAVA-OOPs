package com.company.properties.abstractClass;

public class Daughter extends Parent {

    public Daughter(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("I am going to be a");
    }

    @Override
    void partner() {
        System.out.println("I Love Iron man He is "+age);
    }
}
