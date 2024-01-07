package com.company;

public class exe07_pp04_sumOfMatrices {
    public static void main(String[] args) {
        int [][]mat1 = {{1,2,3},{3,2,1}};
        int [][]mat2  ={{4,5,6},{6,5,4}};
        int total = 0;
        for(int i =0; i<mat1.length; i++){
            for(int j = 0; j <= mat1.length ; j++){
                total = mat1[i][j] + mat2[i][j];
                System.out.print(total);

            }
            System.out.println(" ");
        }
    }
    
}
