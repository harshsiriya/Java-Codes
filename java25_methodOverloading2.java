package com.company;

public class java25_methodOverloading2 {
    static void foo(){
        System.out.println("hello bhai !");
    }
    static void foo(int a){
        System.out.println("your number "+ a + " thank you !");
    }
    static void  foo(int a, int b){
        System.out.println("your number : " + a);
        System.out.println("your number : " + b);
    }
    public static void main(String[] args) {
        foo();
        foo(3000);
        foo(4000,6000);
    }
    
}
