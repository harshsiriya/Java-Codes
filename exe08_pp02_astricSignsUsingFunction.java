package com.company;

public class exe08_pp02_astricSignsUsingFunction {
    static void astric(){
        for(int i = 2; i <= 5 ; i++){
            for(int j = 0; j < i-1 ; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        astric();
    }
    
}
