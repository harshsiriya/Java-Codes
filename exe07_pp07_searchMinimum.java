package com.company;

public class exe07_pp07_searchMinimum {
    public static void main(String[] args) {
        int arr[] = {99,100,101,110,120};
        int  min = arr[0];
        for(int i = 0; i < arr.length ; i++){
            if(min > arr[i]){
                min = arr[i];
            }

        }
        System.out.println(min);
    }
    
}
