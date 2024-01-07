package com.company;
import java.util.Scanner;
public class exe06_pp03_tabelOfNumber {
    public static void main(String[] args) {
        Scanner old = new Scanner(System.in);
        System.out.print("Enter a number to Show Table : ");
        int n = old.nextInt();
        
        for (int i=1; i<= 10;i++){
            int total = 0;
            total = n*i;
            System.out.println(total);
        }
    }
    
}
