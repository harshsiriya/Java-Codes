package com.company;

class cylinder3{
    public cylinder3(int height , int radius){
        float area , volume;
        area = (2f * 3.14f * height * radius) + (2f * 3.14f * radius * radius);
        System.out.println(area);
        volume = (3.14f * radius * radius * height);
        System.out.println(volume);
    }
    public cylinder3(int length , int breath, int height){
        float area , volume;
        area = length * breath;
        System.out.println(area);
        volume = 2 * ( length + breath + height);
        System.out.println(volume);
    }
}
public class exe11_pp04_usingConstructorOverloading {
    public static void main(String[] args) {
        cylinder3 c1 = new cylinder3(20, 10);
        cylinder3 c2 = new cylinder3(20, 10, 5);
        
        
    }
    
}
