package com.company;

class cylinder1{
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
public class exe11_pp02_cylinderRadiusAndVolume {
    public static void main(String[] args) {
        cylinder1 c1 = new cylinder1();
        float area, volume;
        c1.set_height(20);
        c1.set_radius(10);
        area = (2f * 3.14f * c1.get_height() * c1.get_radius()) + (2f * 3.14f * c1.get_radius() * c1.get_radius());
        System.out.print("Area : ");
        System.out.println(area);

        // for volume
        volume = (3.14f * c1.get_radius() * c1.get_radius() * c1.get_height());
        System.out.print("Volume : ");
        System.out.println(volume); 

    }
    
}
