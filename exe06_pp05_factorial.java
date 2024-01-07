package com.company;
import java.util.Scanner;
public class exe06_pp05_factorial {
    public static void main(String[] args) {
        Scanner old = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = old.nextInt();
        int  total = n * 1;
        for(int i = n-1; i != 0; i--){
            total *= i;
        }
        System.out.println(total);

    }
    
}
