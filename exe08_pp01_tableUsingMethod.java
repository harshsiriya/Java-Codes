package com.company;

public class exe08_pp01_tableUsingMethod {
    static void table(int a){
        for(int i = 1; i < 10; i++){
            System.out.print(a*i);
            System.out.println(" ");

        }
    }
    public static void main(String[] args) {
        System.out.println("table of 8 is :");
        table(8);
    }
    
}
