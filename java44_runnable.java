package com.company;

class runnableThread1 implements Runnable{
    public void run(){
        int i = 0;
        while (i < 4000){
        System.out.println("I am a thread 1 not a threat");
        i++;
        }
    } 
}

class runnableThread2 implements Runnable{
    public void run(){
        int i = 0;
        while (i < 4000){
        System.out.println("I am a thread 2 not a threat");
        i++;
        }
    } 
}


public class java44_runnable {
    public static void main(String[] args) {
        runnableThread1 bullet1 = new runnableThread1();
        Thread gun1 = new Thread(bullet1);
        runnableThread2 bullet2 = new runnableThread2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
    
}
