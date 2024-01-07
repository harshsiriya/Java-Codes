package com.company;
import java.util.Scanner;
public class exe02_pp02_gradeEncrypt {
    public static void main(String[] args) {
        Scanner old = new Scanner(System.in);
        System.out.print("Enter a grade:");
        int grade = old.nextInt();
        int grade1 = grade + 8;
        System.out.println(grade1 - 8);
        
    }
    
}
