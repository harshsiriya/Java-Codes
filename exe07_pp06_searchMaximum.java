package com.company;

public class exe07_pp06_searchMaximum {
    public static void main(String[] args) {
        int arr[] = {99,100,101,110,120};
        int  max = arr[0];
        for(int i = 0; i < arr.length ; i++){
            if(max < arr[i]){
                max = arr[i];
            }

        }
        System.out.println(max);
    }
    
}
