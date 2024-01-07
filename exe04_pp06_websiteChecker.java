package com.company;
import java.util.Scanner;
public class exe04_pp06_websiteChecker {
    public static void main(String[] args) {
        Scanner old = new Scanner(System.in);
        System.out.print("enter your Website : ");
        String web = old.nextLine();
        boolean state = web.contains(".com");
        boolean state2 = web.contains(".org");
        boolean state3 = web.contains(".in");
        if(state == true){
            System.out.println("Commercial Website");
        }
        else if(state2 == true){
            System.out.println("Organisation Website");
        }
        else if(state3 == true){
            System.out.println("Indian Website");
        }
        else{
            System.out.println("Enter full Website");
        }
    }
    
}
