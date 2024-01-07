package com.company;

public class java17_forLoop {
    public static void main(String[] args) {
        for(int i=0;i<=10;i++){
            System.out.println(i);
        }
        System.out.println("odd numbers before 20");
        int n = 20;
        for(int j = 0; j<=n ; j++){
            if(j%2 != 0){
                System.out.println(j);
            }
        }

        // decreamenting for loop
        System.out.println("decreamenting for loop:");
        for(int k = 5; k> 0 ;k--){
            System.out.println(k);
        }
    }
    
}
