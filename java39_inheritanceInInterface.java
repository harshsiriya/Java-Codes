package com.company;

interface SampleInterface{
    void meth1();
    void meth2();
}
interface ChildSampleInterface extends SampleInterface{          //Inheritance in interface
    void meth3();                                        //You can implement interface in class but you can not extends interface in class(inheritance)
    void meth4();
}
class MySampleInterface implements ChildSampleInterface{
    public void meth1(){
        System.out.println("Meth 1");                           // If you will not define meth1 and meth2 it through an error 
    }
    public void meth2(){
        System.out.println("Meth 2");
    }
    public void meth3(){
        System.out.println("Meth 3");
    }
    public void meth4(){
        System.out.println("Meth 4");
    }
}
public class java39_inheritanceInInterface {
    public static void main(String[] args) {
        MySampleInterface ms1 = new MySampleInterface();
        ms1.meth1();
        ms1.meth2();
        ms1.meth3();
        ms1.meth4();
    }
    
}
