package com.company;

public class exe07_pp05_reverseArray {
    public static void main(String[] args) {
        int arr[] = {85,86,87,88,89};
        System.out.println("array in reverse order is : ");
        for(int  i = arr.length-1 ; i >= 0 ; i--){
            System.out.println(arr[i]);
        }
    }
    
}
