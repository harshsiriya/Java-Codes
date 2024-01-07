package com.company;
import java.util.Scanner;
public class java13_Switchcase {
    public static void main(String[] args) {
        int age;
        System.out.print("Enter your age:");
        Scanner old = new Scanner(System.in);
        age = old.nextInt();
        switch(age){
            case 18:
                System.out.println("you are adult");
                break;
            case 21:
                System.out.println("your job time");
                break;
            case 60:
                System.out.println("you are retired now");
                break;
            default :
                System.out.println("enjoy your life");


        }
    }
    
}
