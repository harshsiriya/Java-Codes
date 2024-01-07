package com.company;

public class exe07_pp08_sortedArrayOrNot {
    public static void main(String[] args) {
        int arr[] = {99,100,101};
        int sort = arr[0];
        for(int i = 0; i<arr.length ; i++){
            if(sort > arr[i]){
                sort = arr[i];
            }
        }
        if(sort != arr[0]){
            System.out.println("array is not sorted .");
        }

        else{
            System.out.println("array is sorted");
        }
    }
    
}
