package com.company;
import java.util.Scanner;
import java.util.Random;
public class exe05_pp01_RockPaperScissors {
    public static void main(String[] args) {
        Scanner old = new Scanner(System.in);
        Random ran = new Random();
        System.out.println("welcome to Rock Paper Scissor Game :");
        System.out.println("press 1 --> rock");
        System.out.println("press 2 --> Paper");
        System.out.println("press 3 --> scissor");
        int choice = old.nextInt();
        int number = ran.nextInt(2);
        String computer1;
        if (number == 0){
            computer1 = "Paper";
        }
        else if(number == 1){
            computer1 = "Rock";
        }
        else if(number == 2){
            computer1 = "Scissor";
        }
        else{
            computer1 = "Null";
        }
        System.out.println("computers Answer : ");
        System.out.println(computer1);
        if(choice == 1 && number == 0){
            System.out.println("YOU LOST!");
        }
        else if(choice == 1 && number ==1){
            System.out.println("Draw");
        }
        else if(choice == 1 && number == 2){
            System.out.println("YOU WIN!");
        }
        else if(choice == 2 && number == 0){
            System.out.println("Draw");
        }
        else if(choice == 2 && number == 1){
            System.out.println("YOU WIN!");
        }
        else if(choice == 2 && number == 2){
            System.out.println("YOU LOST!");
        }
        else if(choice == 3 && number == 0){
            System.out.println("YOU WIN!");
        }
        else if(choice == 3 && number == 1){
            System.out.println("YOU LOST!");

        }
        else if(choice == 3 && number == 2){
            System.out.println("Draw");
        }
        


    }
    
}
