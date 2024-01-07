package com.company;

public class java11_logical {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        if(a && b){                          // output is N because b is false
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }

        if (a || b){                          // Output is YES because any one of the statements is True
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

        System.out.print("NOT(a) is :");   // a is true thatswhy : false
        System.out.println(!a);                                                    // NOT gate negates the given logic
        System.out.print("NOT(b) is :");  // b is false thatswhy : true
        System.out.println(!b);
    }
    
}
