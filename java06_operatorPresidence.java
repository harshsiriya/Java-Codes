package com.company;

public class java06_operatorPresidence {
    public static void main(String[] args) {
        int x = 6*5-34/2;
        System.out.println(x);
        //presedence and associativity
        int a = 2;
        int b = 4;
        int c = 6;
        int k = (b*b) - (4*a*c)/(2*a); //presidence of * and / operator are same and greater then - operator 
        System.out.println(k);

    }
    
}
