package com.company;

abstract class telephone{
    abstract public void ring();
    abstract public void lift();
    abstract public void disconnect();
}

class SmartPhone extends telephone{         //Polymorphism in this case can be judged as When an object of smartphone is used as ring it can also be called as telephone 
    public void ring(){
        System.out.println("Ring Ring");
    }
    public void lift(){
        System.out.println("Lift it up");
    }
    public void disconnect(){
        System.out.println("Call Hanged Up");
    }
    void wifi(){
        System.out.println("Wifi is connected ");
    }
    void camera(){
        System.out.println("Camera is onn");
    }
}
public class exe13_pp04_telephone {
    public static void main(String[] args) {
        SmartPhone s1 = new SmartPhone();
        s1.ring();
        s1.lift();
        s1.disconnect();
        s1.wifi();
        s1.camera();
    }
    
}
