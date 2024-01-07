package com.company;

class myThread1 extends Thread{
    @Override
    public void run(){
        while (true) {
            System.out.println("My Thread one is running");
        }
    }
}

class myThread2 extends Thread{
    @Override
    public void run(){
        while (true) {
            System.out.println("My Thread");
        }
    }
}

public class java43_multithreading {
    public static void main(String[] args) {
        // multithreading in java is programming concept in which the application can create a smalll unit of task and execute them parallely.

        myThread1 t1 = new myThread1();
        myThread2 t2 = new myThread2();

        t1.start();
        t2.start();     
        // while runnig thins particular code you will observe that it is printing some lines from mythread1 than some lines from mythread2 .
        // basically it is calling first function repeatedly until second function is called (Multithreading)
        
    }
    
}
