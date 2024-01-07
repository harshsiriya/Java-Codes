package com.company;
import java.util.Scanner;
public class exe04_pp02_ifRequired {
    public static void main(String[] args) {
        System.out.println("enter marks:");
        int m1,m2,m3;
        Scanner old = new Scanner(System.in);
        System.out.print("Subject 1 :");
        m1 = old.nextInt();
        System.out.print("Subject 2 :");
        m2 = old.nextInt();
        System.out.print("Subject 3 :");
        m3 = old.nextInt();
        int avg = m1 + m2 + m3;
        float per = avg / 3;
        System.out.println(" ");
        System.out.println("Percentage :");
        System.out.println(per);
        if(per < 33){
            System.out.println("you are fail!");
        }
        else{
            System.out.println("you are pass");
        }

    }
    
}
