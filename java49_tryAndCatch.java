package com.company;

public class java49_tryAndCatch {
    public static void main(String[] args) {
        int a = 6000;
        int b = 0;
        
        // without try
        // int c = a/b;
        // sout(c);                        // you will not see "end of program" because java program is executed line by line and if this line throughs an error, further lines are not executed.
        
        

        // with try:
        try{
            int c = a/b;
            System.out.println("The result is: " + c);
        }catch(Exception e){
            System.out.println("We are failed to divide");
            System.out.println(e);
        }


        System.out.println("End of the program");
    }
    
}
