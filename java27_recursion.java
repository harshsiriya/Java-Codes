package com.company;

public class java27_recursion {  // recursion is function which calls itself 
    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }

    static int factorial_iterative(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            int product = 1;
            for(int i = 1; i<=n; i++){
                product *= i;
            }
            return product;
        }
    }
    public static void main(String[] args) {
        int x = 5;
        System.out.println("factorial of 5 is :" + factorial(x));
        System.out.println("factorial iterative is :" + factorial_iterative(x));
        
    }
    
}
