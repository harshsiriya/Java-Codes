package com.company;

public class exe08_pp04_decreamentAstric {
    static void astric(){
        for(int i = 4; i>0; i--){
            for(int j = i; j>0 ; j--){
                System.out.print("*");

            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        astric();
    }
    
}
