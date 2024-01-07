package com.company;

public class exe08_pp03_sumOfFirstN {
    static int sum(int n){
        int total = 0;
        if(n<= 0){
            total = 0;
        }
        else{
            total = n + sum(n-1);   // recursion logic is used  
        }
        return total;
    }
    public static void main(String[] args) {
        System.out.println("sum using function is : ");
        System.out.println(sum(7));
    }
    
}
