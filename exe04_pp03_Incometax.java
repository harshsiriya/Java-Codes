package com.company;
import java.util.Scanner;
public class exe04_pp03_Incometax {
    public static void main(String[] args) {
        Scanner old = new Scanner(System.in);
        System.out.print("enter your income:");
        int income = old.nextInt();
        if(income >250000 && income <=500000){
            System.out.println("your income tax is : 5%");
        }
        else if(income > 500000 && income <=1000000){
            System.out.println("your income tax is : 20%");

        }
        else if(income >1000000){
            System.out.println("your income tax is : 30%");
        }
        else{
            System.out.println("your income tax is : 0");
        }

    }
    
}
