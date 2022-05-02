package com.company.exceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
//            divide(a,b);
            //mimicing
//            throw new Exception("just for fun");
            String name="JAVA";
            if (name.equals("JAVA")){
                throw new MyException("This is my exception");
            }
        }
        catch (MyException e) {
            System.out.println(e.getMessage());

        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());

        }
        catch (Exception e) {
            System.out.println("Normal Exception");

        }
        finally {
            //Must Always run
            System.out.println("Final");
        }
    }
    static int divide(int a,int b) throws ArithmeticException{
        if (b==0){
            throw new ArithmeticException("Can not divide by 0");
        }
        return a/b;
    }
}
