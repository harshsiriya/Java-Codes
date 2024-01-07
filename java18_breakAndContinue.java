package com.company;

public class java18_breakAndContinue {
    public static void main(String[] args) {
        //break
        
        for (int i = 0; i<5; i++){
            System.out.println(i);
            System.out.println("java");
            if(i == 2){
                System.out.println("Ending of loop");
                break;
            }
        }

        //continue

        for(int i =0;i<5;i++){
            if(i == 2){
                System.out.println("I AM 2");
                continue;
            }
            System.out.println(i);
        }
    }
    
}
