package com.company;

class newThread extends Thread{
    public void run(){
        while(true){
            System.out.println("Good Morning!");
            
        }
    }
}

class newThread1 extends Thread{
    public void run(){
        while(true){
            System.out.println("Welcome");
        }  
    }
}
public class exe14_pp01_threading {
    public static void main(String[] args) {
        newThread n1 = new newThread();
        newThread1 n2 = new newThread1();
        n1.start();
        n2.start();

        n1.getPriority();
        n1.setPriority(20);
    }
    
}
// state of Thread
// we can get the state of Thread by the method 'object.getState()' in java
// it provides the current state ,example(new , runnable, running , non-runnable)

// refrence in java
// we can get the refrence of Thread by method 'Thread.currentThread().getState()' 
