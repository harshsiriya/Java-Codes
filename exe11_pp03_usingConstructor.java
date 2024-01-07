package com.company;

class cylinder2{
    public cylinder2(int height , int radius){
        float area , volume;
        area = (2f * 3.14f * height * radius) + (2f * 3.14f * radius * radius);
        System.out.println(area);
        volume = (3.14f * radius * radius * height);
        System.out.println(volume);
    }
}
public class exe11_pp03_usingConstructor {
    public static void main(String[] args) {
        cylinder2 c1 = new cylinder2(20, 10);
        
    }
    
}
