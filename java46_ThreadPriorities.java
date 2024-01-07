package com.company;

class mythr1 extends Thread{
    public mythr1(String name){
        super(name);
    }
    public void run(){

        int a = 34;
        
        while(true){
            System.out.println("Thank you! : " + this.getName());
        }
    }
}

public class java46_ThreadPriorities {
    public static void main(String[] args) {
        mythr1 m = new mythr1("Harsh  (most Priority)");
        mythr1 m2 = new mythr1("Sanjay dutt 0");
        mythr1 m3 = new mythr1("Sanjay dutt 1");
        mythr1 m4 = new mythr1("Sanjay dutt 2");
        mythr1 m5 = new mythr1("Sanjay dutt 3");

        m.setPriority(Thread.MAX_PRIORITY);
        m.start();
        m2.start();
        m3.start();
        m4.start();
        m5.start();
    }  
}
