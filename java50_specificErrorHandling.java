package com.company;

import java.util.Scanner;

public class java50_specificErrorHandling {
    public static void main(String[] args) {
        int []marks = new int[3];
        marks[0] = 7;
        marks[1] = 54;
        marks[2] = 64;
        Scanner old = new Scanner(System.in);
        System.out.println("Enter the array index : " );
        int k = old.nextInt();       

        System.out.println("Enter the number you want to divide the value with");
        int number = old.nextInt();
        try{
            System.out.println("The value at the index Entered is " + marks[k]);
            System.out.println("the value of array value/ number is :" + marks[k]/number);
        }catch(ArithmeticException e){
            System.out.println("Arithmatic Exception Occured");
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bound");
            System.out.println(e);
        }catch(Exception e){
            System.out.println("Some Exception Occured");
            System.out.println(e);
        }
    }
}