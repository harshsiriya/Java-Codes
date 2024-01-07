package com.company;

class sphere{
    private int radius;
    public void set_radius(int a){
        this.radius = a;
    }
    public int get_radius(){
        return radius;
    }
}
public class exe11_pp05_sphereUsingGetterAndSetter {
    public static void main(String[] args) {
        sphere one = new sphere();
        one.set_radius(10);
        System.out.print("Radius of Sphere is : ");
        System.out.println(one.get_radius());
    }
    
}
