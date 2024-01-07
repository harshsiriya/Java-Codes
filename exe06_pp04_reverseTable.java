package com.company;
import java.util.Scanner;
public class exe06_pp04_reverseTable {
    public static void main(String[] args) {
        Scanner old = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = old.nextInt();
        for(int i = 10; i!=0; i--){
            int total = 0;
            total = n*i;
            System.out.println(total);
        }
    }
    
}
