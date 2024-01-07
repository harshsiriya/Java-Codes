package com.company;

public class exe08_pp07_repeat4UsingRecursion {
    static void repeat(int n){
        if(n==0){
            System.out.println(0);
        }
        else{
          do{
            System.out.print(4);
          }while(n>0);
        }
    }
    public static void main(String[] args) {
        repeat(4);
    }
    
}
