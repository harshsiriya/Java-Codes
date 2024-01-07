package com.company;

import java.util.Random;
import java.util.Scanner;

class game{
    public int number;
    public int noofguesses = 0;
    public int input_number;
    public int get_noofguesses(){
        return noofguesses;
    }

    public void set_noofguesses(int noofguesses){
        this.noofguesses = noofguesses;
    }
    game(){
        Random ran = new Random();
        this.number = ran.nextInt(100);
    }
    void takeuserinput(){
        Scanner old = new Scanner(System.in);
        System.out.print("guess the number : ");
        input_number = old.nextInt();
    }
    boolean iscorrectnumber(){
        noofguesses ++;
        if(input_number == number){
            System.out.println("congrats yo got it right ! ");
            System.out.format("You gussed it in %d attempts", noofguesses);
            System.out.println(" ");
            return true;
        }
        else if(input_number < number){
            System.out.println("lesser");
        }
        else if(input_number > number){
            System.out.println("greater");
        }
        return false;

    }
}
public class exe10_pp01_guessTheNumber {
    public static void main(String[] args) {
        game g = new game();
        boolean b = false;
        while(!b){
        g.takeuserinput();
         b = g.iscorrectnumber();
        System.out.println(b);

        }
    }
    
}
