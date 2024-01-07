package com.company;

abstract class pen{
    abstract public void write();
    abstract public void refill();
}
class pen1 extends pen{
    public void write(){
        System.out.println("Pen is Writting");
    }

    public void refill(){
        System.out.println("Pen is Refilling");
    }
    
}


public class exe13_pp01_penWrite {
    public static void main(String[] args) {
        pen1 p1 = new pen1();
        p1.write();
        p1.refill();
    }
    
}
