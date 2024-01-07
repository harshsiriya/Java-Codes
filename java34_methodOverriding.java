package com.company;

class A{                                                 //Method Overriding : redefinig method of super class in subclass
    public int harsh(){
        return 4;
    }
    public void meth2(){
        System.out.println("I Am method 2 of class A");                       //if we create an object of class B  meth2 will provide this 
    }

}
class B extends A{
    @Override                       /// this is an override notation , this is only to wheather a method is overriding or not (not necessary to always apply)
    public void meth2(){
        System.out.println("I Am method 2 of class B");                       // here we override meth2 in class B 
    }                                                                           /// now if we create object of class b we will get this

    public void meth3(){
        System.out.println("I am method 3 of class B");
    }
}
public class java34_methodOverriding {                                     // use of method overiding is to , whenever i call meth2 from an object of class B
    public static void main(String[] args) {                             // it should perform an particular task
        A a = new A();                                                       // but whenever it is called by the object of class A it should work as an method only 
        a.meth2();

        B b = new B();
        b.meth2();
    }
    
}
