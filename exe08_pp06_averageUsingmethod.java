package com.company;

public class exe08_pp06_averageUsingmethod {
    static int average(int ...arr){
        int total = 0;
        for(int a : arr){
            total += a;
        }
        return total / arr.length;
    }
    public static void main(String[] args) {
        System.out.println(average(1,2,3,4,5,6,7,8,9,10,11,12));
    }
    
}
