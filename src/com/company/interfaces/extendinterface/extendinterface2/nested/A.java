package com.company.interfaces.extendinterface.extendinterface2.nested;

public class A {
    public interface NestedInterface{
        boolean isOdd(int num);
    }

}
class B implements A.NestedInterface{

    @Override
    public boolean isOdd(int num) {
        return (num&1)==1;
    }
}
