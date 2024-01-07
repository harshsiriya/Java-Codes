package com.company;
import java.util.Scanner;
public class java08_strings {
    public static void main(String[] args) {
        String name = "harsh";
        System.out.println(name);

        int a = 6;
        float b = 5.656f;
        System.out.printf("the value of a is %d and value of b is %8.2f", a,b);
        System.out.println(" ");

        System.out.format("the value of a is %d and value of b is %f", a,b);
        System.out.println(" ");
        
        Scanner old = new Scanner(System.in);
        String str = old.nextLine();
        System.out.printf("%s", str);
    }
    
}
