package com.company;

public class exe08_pp05_nthTermOfFibonacci {
    static int fibonacci(int n){

        if(n == 1){
            return 0;
        }
        else if(n == 2){
            return 1;
        }
        else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
        
    }
    public static void main(String[] args) {
        System.out.println(fibonacci(10));
    }
    
}
