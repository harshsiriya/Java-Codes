package com.company;

abstract class pen2{
    abstract public void change_nib();
}
class fountainPen extends pen2{
    public void change_nib(){
        System.out.print("Nib is being changed");
    }
}
public class exe13_pp02_fountainPen {
    public static void main(String[] args) {
        fountainPen fp = new fountainPen();
        fp.change_nib();
    }
    
}
