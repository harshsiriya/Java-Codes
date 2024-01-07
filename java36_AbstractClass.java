package com.company;

abstract class parent2{                                          // Abstract class : Abstract class is the class which contains abstract method
    parent2(){                              
        System.out.println("Mai base2 ka constructor hu !");          // Abstract class ka object nhi banta
    }                                                                // Abstract class is just to declare abstract methods for subclasses 
    public void sayhellow(){
        System.out.println("Hellow!");
    }
    abstract public void greet();                            //Abstract method is the the method that is declared without an implementation
    abstract public void greet2();
}
class child1 extends parent2{
    public void greet(){
        System.out.println("Hola");
    }
    public void greet2(){
        System.out.println("Sayonara");
    }
}

class child2 extends parent2{                           // Two defination of single declared method is allowed in the case of abstraction
    @Override
    public void greet(){
        System.out.println("Good Morning ! ");
    }
    public void greet2(){
        System.out.println("Good Afternoon ! ");
    }
}


abstract class child3 extends parent2{
    public void th(){
        System.out.println("I am good");
    }
}
public class java36_AbstractClass {
    public static void main(String[] args) {
        // parent2 p2 = new parent2();     --> will through an error because you cannot create object of abstract class
        child2 c2 = new child2();
        // child3 c3 = new child3();          --> will also through error because it is also an abstract class
        c2.greet();
        c2.greet2();


        child1 c1 = new child1();
        c1.greet();
        c1.greet2();
    }
    
}
