package com.company;

import java.util.Scanner;

public class exe15_pp02_haha {
    public static void main(String[] args) {
        try{
            Scanner old = new Scanner(System.in);
            System.out.println("Enter number : ");
            int k = old.nextInt();
            System.out.println("1000 divisible of number is  : " + 1000/k);
        }catch(ArithmeticException e){
            System.out.println("HaHa");
        }catch(IllegalArgumentException e){
            System.out.println("HeHe");
        }
    }
    
}
