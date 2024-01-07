package com.company;
import java.util.Scanner;

public class java03_takingInput{
    public static void main(String[] args) {
        System.out.println("Taking input from user :");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number 1 :");
        //int a = sc.nextInt();
        float a = sc.nextFloat();              // code for number {commented program is only for int numbers}
        System.out.print("Enter Number 2 :");
        //int b = sc.nextInt();
        float b = sc.nextFloat();
        //int sum = a + b;
        float sum = a+b;
        System.out.print("the sum of these two number is :");
        System.out.println(sum);
        System.out.print("enter an Integer : ");    // to check whether user has input correct data type 
        boolean b1 = sc.hasNextInt();
        System.out.println(b1);
        System.out.print("enter a string : ");      // to input a string
        String str1 = sc.nextLine();
        System.out.println(str1);

    }
}
