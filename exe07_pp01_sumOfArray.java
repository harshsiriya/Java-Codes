package com.company;
public class exe07_pp01_sumOfArray {
    public static void main(String[] args) {
        float []arr = {98.7f, 95.6f, 36.2f, 45.5f, 36.4f};
        float total = 0;
        for(int i =0; i< arr.length; i++){
            total += arr[i];
        }
        System.out.print("the sum of array : ");
        System.out.println(total);
    }
    
}
