package com.company;

import java.util.Scanner;

public class java51_nestedTryCatch {
    public static void main(String[] args) {
        int []marks = new int[3];
        marks[0] = 7;
        marks[1] = 54;
        marks[2] = 64;
        Scanner old = new Scanner(System.in);
        boolean flag = true;
        while(flag){
        System.out.println("Enter the  value  of index");
        int k = old.nextInt();
        try{
            System.out.println("Welcome  to video number 82");
            try{
                System.out.println(marks[k]);
                flag = false;
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("This index does not exist");
                System.out.println("Exception in level 2 ");
            }
        }catch(Exception e){
            System.out.println("Exception in level 1 ");
        }
    }

    System.out.println("Thanks for using this program");
    }
    
}
