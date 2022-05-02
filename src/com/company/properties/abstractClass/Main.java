package com.company.properties.abstractClass;

public class Main {
    public static void main(String[] args) {
        Son son=new Son(14);
        Daughter daughter=new Daughter(18);
        son.career();
        daughter.career();
        son.normal();
        daughter.normal();

        //can not create the object of abstract class
//        Parent mom=new Parent(70) {
//            @Override
//            void career() {
//
//            }
//
//            @Override
//            void partner() {
//
//            }
//        };
        Parent.greeting();
    }

}
