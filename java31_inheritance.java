package com.company;

class base{
    int x;
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void printme(){
        System.out.println("hello");
    }
}

class derived extends base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class java31_inheritance {                   // inheritance is used to borrow methods and properties from an existing class
    public static void main(String[] args) {
        base b = new base();
        b.setX(10);
        System.out.println(b.getX());

        //for derived class

        derived d = new derived();
        d.setX(20);                                 // using setx means setter of base class
        System.out.println(d.getX());

        // also for int y of derived class

        d.setY(30);
        System.out.println(d.getY());
    }
    
}
