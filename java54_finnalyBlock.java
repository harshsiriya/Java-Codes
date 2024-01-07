package com.company;

public class java54_finnalyBlock {
    public static int greet(){
        try{
            int a = 50;
            int b = 2;
            int c = a/b;
            return c;      // greet method should be terminated here but since we write finally block at the end of function so that we will receive sout statement
        }catch(Exception e){
            System.out.println(e);
        }
        finally{         // finally block is the block of statement which will execute in any conditions (no matter if you handle exception or not)
        System.out.println("this is the end of the program");
        }
        return 0;
    }

    public static void main(String[] args) {
        int k = greet();
        System.out.println(k);
}
}


