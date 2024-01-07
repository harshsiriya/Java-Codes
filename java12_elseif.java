package com.company;
import java.util.Scanner;
public class java12_elseif {
    public static void main(String[] args) {
        int age;
        System.out.print("enter age:");
        Scanner old = new Scanner(System.in);
        age = old.nextInt();
        if (age>56){
            System.out.println("you are Experienced");
        }
        else if(age > 46){
            System.out.println("you are semi Experienced");
        }
        else if(age > 36){
            System.out.println("you are semi-semi-Experienced");
        }
        else{
            System.out.println("you are not experienced");
        }
    }
    
}
