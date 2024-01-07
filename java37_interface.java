package com.company;

interface bicycle{
    int a = 45;
    void apply_break(int decreament);
    void Speed_up(int increment);
}

interface hornBicycle{
    void blowHornK3g();
    void BlowHornmhn();
}

class Avon implements bicycle, hornBicycle{
    public void blow_horn(){
        System.out.println("Ting Tong");
    }

    public void apply_break(int decreament){                              // When ever you are writing the defination of interface abstracted methods , Access modifer should be public.
        System.out.println("Applying Breaks by : " + decreament);
    }
    public void Speed_up(int increment){
        System.out.println("Speeding  up by : " + increment);
    }

    public void blowHornK3g(){
        System.out.println("Kabhi Khushi Kabhi Gum");
    }
    public void BlowHornmhn(){
        System.out.println("Main Hoon Naa");
    }
}
public class java37_interface {
    public static void main(String[] args) {
        // Interface : Group of related methods with empty bodies. 


        // major difference between Abstract class and interfaces are :
        
          // 1. You can not create An class using Multiple Abstract classes but you can create an class using Multiple Interfaces (Multiple Inheritance) 
          // 2. Abstract class can have methods other than Abstract methods but interfaces can only have Abstract Methods.
        Avon a1 = new Avon();
        a1.apply_break(10);
        // you can create properties in interfaces 
        System.out.println(a1.a);

        // you can not modify properties in interfaces (a1.a = 50;) not accecptable.

        a1.blowHornK3g();
        a1.BlowHornmhn();
    }
    
}
