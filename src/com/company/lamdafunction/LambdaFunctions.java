package com.company.lamdafunction;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunctions {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        for (int i = 0; i <5 ; i++) {
            arr.add(i+1);
        }
//        arr.forEach(item-> System.out.println(item));

        Consumer<Integer> fun=(item-> System.out.println(item));
        arr.forEach(fun);
//        Operation sum= Integer::sum;//same as above
        Operation sum=(a,b)->a+b;
        Operation prod=(a,b)->a*b;
        Operation sub=(a,b)->a-b;
        Operation div=(a,b)->a/b;
        LambdaFunctions myCalci=new LambdaFunctions();
        System.out.println(myCalci.operate(5,7, sum));
        System.out.println(myCalci.operate(3,5,prod));
    }
    private int operate(int a,int b,Operation op){
        return op.op(a,b);
    }
    int sum(int a,int b){
        return a+b;
    }
    interface Operation{
        int op(int a,int b);
    }
}
