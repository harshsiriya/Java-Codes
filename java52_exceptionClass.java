package com.company;

import java.util.Scanner;

class MyException extends Exception{
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "I am to string";
    }


    @Override
    public String getMessage() {
        // TODO Auto-generated method stub
        return "I am get message";
    }
}
public class java52_exceptionClass {
    public static void main(String[] args) {
        int a;
        Scanner  old = new Scanner(System.in);
        System.out.println("Enter a number : ");
        a = old.nextInt();
        if(a <9){
            try{
            throw new MyException();
            }catch(Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace();
            }
        } 
    }
    
}
