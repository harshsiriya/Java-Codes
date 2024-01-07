package com.company;

class square{
    int side;
    public void perimeter(){
        System.out.println("perimeter : " + (4 * side));
    }
    public void area(){
        System.out.println("Area : " + (2 * side));
    }
}
public class exe09_pp03_square {
    public static void main(String[] args) {
        square one = new square();
        one.side= 10;
        one.perimeter();
        one.area();
        
    }
    
}
