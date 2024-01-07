package com.company;


class negativeAreaExceptiion extends Exception{
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Radius can not be negative";
    }
    @Override
    public String getMessage() {
        // TODO Auto-generated method stub
        return "Radius can not be negative";
    }
}


public class java53_throwThrows {


    public static double area(int r) throws negativeAreaExceptiion{
        if(r<0){
            throw new negativeAreaExceptiion();
        }
        double r1 = Math.PI * r * r;
        return r1;
    }


    public static int division(int a , int b) throws ArithmeticException{
        int result = a / b;
        return result;
    }


    public static void main(String[] args) {
        try{
            int c = division(6, 0);
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println(e);
        }

        try {
            double ar = area(6);
        } catch (negativeAreaExceptiion e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
}
