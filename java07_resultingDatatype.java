package com.company;

public class java07_resultingDatatype {
    public static void main(String[] args) {
        byte a = 1;
        int b = 6;
        int c = 7;
        float x = 5.56f + b;
        System.out.println(x);

        // increat=ment and decrement operator

        int i = 56;
        
        System.out.println(i++); // i is first assigned to print statement and then increamented(56)
        System.out.println(i); // inreamented i prints(56+1)
        System.out.println(++i); // first increase the value of i and then assign to print statement(57+1)
        System.out.println(i); // similar i is printed (58)

        char ch =  'x';
        System.out.println(++ch);


        
    }
    
}
