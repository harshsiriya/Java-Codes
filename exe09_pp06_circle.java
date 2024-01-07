package com.company;

class circle{
    int radius;
    public double area(){
        double area = (radius * (3.14) * (radius));
        return area;
    }

    public float perimeter(){
        float perimeter = (2 * (3.14f) * (radius));
        return perimeter;
    }
}
public class exe09_pp06_circle{
    public static void main(String[] args) {
        circle one = new circle();
        one.radius = 10;
        System.out.println(one.area());
        System.out.println(one.perimeter());
        
    }
}
