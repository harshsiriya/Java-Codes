package com.company;
import java.util.Scanner;

//Q.) WAP to calculate the CGPA usnig marks of three subjects


public class exe01_pp02CGPA {
    public static void main(String[] args) {
        System.out.println("CGPA Calculator");
        Scanner old = new Scanner(System.in);
        System.out.print("Enter marks of sub 1 : ");
        int a = old.nextInt();
        System.out.print("Enter marks of sub 2 : ");
        int b = old.nextInt();
        System.out.print("Enter marks of sub 3 : ");
        int c = old.nextInt();
        int sum = a+b+c;
        float x = sum / 3;
        System.out.print("CGPA : ");
        System.out.println(x);


        
    }
    
}
