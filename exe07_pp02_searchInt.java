package com.company;
import java.util.Scanner;
public class exe07_pp02_searchInt {
    public static void main(String[] args) {
        Scanner old = new Scanner(System.in);
        int [] flats = {87,85,86,84,83};
        System.out.print("enter a number to be searched : ");
        int  search = old.nextInt();
        for(int  i =0 ; i< flats.length ; i++ ){
            if(search == flats[i]){
                System.out.println(flats[i]);
                System.out.println("found it!");
            }
            else{
                continue;
            }
        }


    }
    
}
