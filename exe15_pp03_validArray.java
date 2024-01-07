package com.company;

import java.nio.channels.AsynchronousByteChannel;
import java.util.Scanner;


class customException extends Exception{
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Array Index out of bound";
    }
}
public class exe15_pp03_validArray {
    public static void main(String[] args) {
        int []marks = {0,1,2,3,4};
        int i = 0;
        while(i < 5){
            try{
                Scanner old = new Scanner(System.in);
                System.out.println("Enter the index of array : ");
                int k = old.nextInt();
                if(k < 4){
                    i = 6;
                }
                System.out.println(marks[k]);
                try{
                    throw new customException();
                }catch(Exception e){
                    e.toString();
                }
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
                i++;
            }
        }
    }
    
}
