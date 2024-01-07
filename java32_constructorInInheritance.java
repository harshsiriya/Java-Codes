package com.company;

class base1{
    base1(){
        System.out.println("I Am A Constructor");
    }
    base1(int a){
        System.out.println("I am an overloaded constructor with value : " + a);
    }

}

class derived1 extends base1{
    derived1(){
        super(21);                               // used to run overloaded constructor                       
        System.out.println("I am a derived class constructor");
    }

    derived1(int a, int  b){
        super(a);                               // this will call the constructor of base class and pass on variable 'a'
        System.out.println("I am an overloaded constructor of derived class with value : " + b );
    }
}

class childOfDerived extends derived1{
    childOfDerived(){
        System.out.println("i am child of derived class constructor ");
    }
    childOfDerived(int x, int y, int z){
        super(x, y);
        System.out.println("I am an overloaded constructor of Child of derived class with value : " + z );
    }
}
public class java32_constructorInInheritance {
    public static void main(String[] args) {
        base1 b1 = new base1();                 // only base class constructor will be shown
        derived1 d1 = new derived1(14,9);           // constructor shown from both the class (base as well as derived)
        childOfDerived ch = new childOfDerived(10, 12, 16);                                      
        
        
        
        // in the case of constructor overloading, the constructor which will run is (without argument) 
        // to run the argumented constructor , we will use super keyword







        // super is the magical keyword which pass the value of current constructor to the base class constructor;
        // HINDI ME
        // super kam karta hai thairo wala
        // voh constructor (without parameters) ko call karne se pahle rok deta hai
        // or uske hath me ek variable dekar use upar bhaij deta hai..
    }
    
}
