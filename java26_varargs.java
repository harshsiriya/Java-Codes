package com.company;

public class java26_varargs{
    static int sum(int a ,int b){
        return a + b;
    }

    static int sum(int a, int b, int c){
        return a+b+c;
    }

    //varargs

    static int sum1(int ...arr){
        int total = 0;
        for(int a : arr){
            total += a;
        }
        return total;
    }

    static int sum2(int x, int ...arr){
        int result = x;
        for(int a : arr){
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("welcome to varargs : ");
        System.out.println("the sum of 4 and 5 :" + sum(4, 5));
        System.out.println("the sum of 3 , 4 and 5 : " + sum(3,4,5));

        // if we dont know about how many parameters will be present in an particular method
        // we use varargs (...)
        // it will store argument as an array

        // lets use varargs

        System.out.println("varargs ouput for sum of 2,3,4,5,6,7 : "+ sum1(2,3,4,5,6,7));

        // varargs with an compulsory x variable

        System.out.println("compulsory int element :" + sum2(1, 2,3,4,5,6,7,8,9));


    }
    
}
