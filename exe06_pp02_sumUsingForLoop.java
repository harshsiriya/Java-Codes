package com.company;
import java.util.Scanner;
public class exe06_pp02_sumUsingForLoop {
    public static void main(String[] args) {
        Scanner old = new Scanner(System.in);
        System.out.print("enter the number of even number you want : ");
        int n = old.nextInt();
        int total = 0;
        for (int i =1; i<= n; i++){
            System.out.println(2*i);
            total += i;
        }
        System.out.print("total : ");
        System.out.println(total);
    }
    
}
