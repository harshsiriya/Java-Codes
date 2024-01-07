package com.company;

class rectangle{
    int length;
    int breath;
    public int area(){
        return (length * breath);
    }
    public int perimeter(){
        return (2 * (length * breath));
    }
}
public class exe09_pp04_rectangle {
    public static void main(String[] args) {
        rectangle one = new rectangle();
        one.length = 10;
        one.breath = 5;
        System.out.println(one.area());
        System.out.println(one.perimeter());
        
    }
    
}
