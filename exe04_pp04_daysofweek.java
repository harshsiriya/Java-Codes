package com.company;
import java.util.Scanner;
public class exe04_pp04_daysofweek {
    public static void main(String[] args) {
        Scanner old = new Scanner(System.in);
        System.out.print("Enter day(1 - 7):");
        int day = old.nextInt();
        if(day == 1){
            System.out.println("Today is Monday");
        }
        else if(day ==2){
            System.out.println("Today is Tuesday");
        }
        else if(day ==3){
            System.out.println("Today is Wednesday");
        }
        else if(day == 4){
            System.out.println("Today is Thrusday");

        }
        else if(day == 5){
            System.out.println("Today is Friday");
        }
        else if(day == 6){
            System.out.println("Today is Saturday");
        }
        else if(day == 7){
            System.out.println("Today is Sunday");
        }
        else{
            System.out.println("Invalid input");
        }
    }
    
}
