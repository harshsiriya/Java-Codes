package com.company;

public class exe06_pp09_sumOfMultiplication {
    public static void main(String[] args) {
        int n = 8;
        int total;
        int m = 0;
        for (int i=1;i<=10;i++){
            total = n*i;
            m += total;
        }
        System.out.println(m);
    }
    
}
