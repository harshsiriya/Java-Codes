package com.company;

public class java23_methods {
    static int logic(int x , int y){  // methods
        int z;                            // DRY :- Dont repeat yourself
        if( x > y){                       // you can use as much time as you want in main function
            z = x + y;
        }                                 // method is a self contain block of logic which is present inside some class
        else{
            z = (x+y) * 5;
        }
        return z;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        java23_methods obj = new java23_methods();        //here  we crete an object for a method we declare
        int c = obj.logic(a, b);                          //  yellow line because we are using static in our method, so compiler is having no need to create ann object
        System.out.println(c);

        // once again

        int m = 3;
        int n = 1;
        int o = logic(m, n);      // this a normal call function for a particular method without an object (static  is used)
        System.out.println(o);
    }
    
}
