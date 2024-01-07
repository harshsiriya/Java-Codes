package com.company;

class mythr extends Thread{
    public mythr(String name){
        super(name);
    }
    public void run(){

        int a = 34;
        System.out.println("Thank you!");
        // while(true){
        // System.out.println("I am a thread ");
        // }
    }
}

public class java45_ConstructorThread {
    public static void main(String[] args) {
        mythr m = new mythr("Harsh");
        mythr m2 = new mythr("Sanjay dutt");

        m.start();
        m2.start();

        System.out.println("The id of this thread is : "+m.getId());
        System.out.println("The name of this thread is : " + m.getName());

        System.out.println("The id of this thread is : "+m2.getId());
        System.out.println("The name of this thread is : " + m2.getName());
    }
    
}
