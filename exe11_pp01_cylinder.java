package com.company;

class cylinder{
    private int height;
    private int radius;
    public void set_height(int a){
        this.height = a;
    }
    public int get_height(){
        return height;
    }
    public void set_radius(int b){
        this.radius = b;
    }
    public int get_radius(){
        return radius;
    }
}
public class exe11_pp01_cylinder {
    public static void main(String[] args) {
        cylinder c1 = new cylinder();
        c1.set_height(20);
        System.out.println(c1.get_height());
        c1.set_radius(10);
        System.out.println(c1.get_radius());
    }
    
}
