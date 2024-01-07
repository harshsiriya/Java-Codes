package com.company;

public class java21_multidimentioonalArrays {
    public static void main(String[] args) {
        //multi-dimentional array is nothing but array of array(2-d array)
        
        int [][]flats ;
        flats  = new int[2][3];
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 303;

        //  displaying  2-d array using nested loop

        for(int i = 0; i < flats.length ; i++){
            for(int j = 0; j< flats[i].length ; j++){
                System.out.println(flats[i][j]); 
            }
        }
    }
    
}
